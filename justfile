
build:
    ./gradlew shadowJar

deploy: build
    cp "./waypoints/build/libs/waypoints-3.5.4.jar" "./server/minecraft-data/plugins/"

restart: deploy
    #!/bin/bash
    cd server
    docker compose restart
    docker compose logs -f

logs:
    #!/bin/bash
    cd server
    docker compose logs -f