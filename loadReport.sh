#!/usr/bin/env bash
export token
token=$(curl --location 'https://xray.cloud.getxray.app/api/v2/authenticate' --header 'Content-Type: application/json' --data @"cloud_auth.json" | tr -d '"')
curl --location 'https://xray.cloud.getxray.app/api/v2/import/execution/cucumber/multipart' --header "Authorization: Bearer $token" --form 'info=@"info.json"' --form 'results=@"results/Cucumber.json"' > log.txt
export issueKey
issueKey=$(grep "XRAY1-" log.txt | cut -d '"' -f 8)
export url
url=https://pruebasdeautomatizacion.atlassian.net/rest/api/3/issue/$issueKey/attachments
export jiraToken
jiraToken=$(cat jira_token.txt)
curl --insecure -X POST "$url" --header 'X-Atlassian-Token: no-check' --header "Authorization: Basic $jiraToken" --header 'Cookie: atlassian.xsrf.token=91f4697a-09a4-4812-b4e3-a5ce695b9758_3edd0a4a055bdebd64b7d4455277b22da8ead7db_lin' --form 'file=@"results/reporteQA.pdf"'