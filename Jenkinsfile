pipeline {
  agent any
  parameters {
    string(name: 'tag', description: 'tag para ejecución de escenario o plan de pruebas')
  }
  tools {
    gradle 'gradle-7.6'
  }
  stages {
    stage('EjecucionPruebasRetornoReportTesting') {
      stages {
        stage('git') {
          steps {
            git branch: 'main', url: 'https://github.com/reyalejandro/AutomatizacionGradleJenkins'
          }
        }
        stage('gradle') {
          steps {
            sh 'gradle --v'
            sh 'gradle runWithCucumber -P tags=${tag}'
          }
        }
        stage('Xray Gherkin Documentation Export') {
          steps {
          sh '''
                export token
                token=$(curl --location 'https://xray.cloud.getxray.app/api/v2/authenticate' --header 'Content-Type: application/json' --data @"cloud_auth.json" | tr -d '"')
                curl --location 'https://xray.cloud.getxray.app/api/v2/import/execution/cucumber/multipart' --header "Authorization: Bearer $token" --form 'info=@"info.json"' --form 'results=@"results/Cucumber.json"' > log.txt
                export issueKey
                issueKey=$(grep "XRAY1-" log.txt | cut -d '"' -f 8)
                export url
                url=https://pruebasdeautomatizacion.atlassian.net/rest/api/3/issue/$issueKey/attachments
                export jiraToken
                jiraToken=$(cat jira_token.txt)
                curl -k -X POST "$url" --header 'X-Atlassian-Token: no-check' --header "Authorization: Basic $jiraToken" --header 'Cookie: atlassian.xsrf.token=91f4697a-09a4-4812-b4e3-a5ce695b9758_3edd0a4a055bdebd64b7d4455277b22da8ead7db_lin' --form 'file=@"results/reporteQA.pdf"'
          '''

          }
        }
      }
    }
  }
}
