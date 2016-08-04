# capsule-javapackager

A simple maven project that builds a capsule jar and a hard-coded javapackager batch file to create an installer.

1. Run the Maven build/install
1. Run the built capsule jar (capsule-javapackager-0.1-SNAPSHOT-capsule.jar)
1. Modify the batch file to point to your JDK path (javapackager_deploy.bat)
1. Run the batch file (javapackager_deploy.bat)
1. Try to run the native executable (dist\bundles\capsule-javapackager\capsule-javapackager.exe)
1. Sanity check: run the bundled capsule jar (dist\bundles\capsule-javapackager\capsule-javapackager-0.1-SNAPSHOT-capsule.jar)
