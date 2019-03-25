# TodoAppium

1.Test “Create Project” 	1. Create test project via API. 	2. Login into mobile application. 	3. Verify on mobile that project is created 

To create a test project via API:

Run :


curl https://todoist.com/api/v8/sync \
    -d token=3747dbb3183aeb9df64db40022c3525d2517343c \
    -d sync_token="Your Token" \
    -d resource_types='["projects"]' \
    -d commands='[
        { "type": "project_add",
          "temp_id": "24a193a7-46f7-4314-b984-27b707bd2331",
          "uuid": "e23db5ec-2f73-478a-a008-1cb4178d2fd1",
          "args": { "name": "Project2" } }
      ]'
