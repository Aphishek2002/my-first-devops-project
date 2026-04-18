name: Run My Java File

on: push

jobs:
  run-java:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout code
        uses: actions/checkout@v3

      - name: Install Java
        uses: actions/setup-java@v3
        with:
          distribution: 'temurin'
          java-version: '17'

      - name: Compile Java
        run: javac Main.java

      - name: Run Java
        run: java Main
