@echo off

rem Execute with .\start.bat - must include the .bat.

echo %~dp0

java -jar %~dp0\target\dropwizard-project-application-1.0.jar server %~dp0\dropwizard-project-application.yml

pause