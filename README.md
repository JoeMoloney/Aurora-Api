# Aurora-Api
Api layer to demonstrate Restful services

Profiles:

    Default:
        Will use port 2468

    Local:
        Set VM Option: "-Dspring.profiles.active=local" to use application-local.yml configuration
            Will use port 8082

Lombok Annotation Processing:

    IntelliJ IDEA
        Go to File > Settings > Build, Execution, Deployment > Compiler > Annotation Processors.
        Ensure that "Enable annotation processing" is checked.
    Eclipse
        Go to Window > Preferences > Java > Compiler > Annotation Processing.
        Check "Enable annotation processing".

Banner Art Generator:
    https://patorjk.com/software/taag/#p=display&h=1&f=Slant%20Relief&t=Aurora%20API