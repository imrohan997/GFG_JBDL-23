package org.example;

/**
 * This project is used to demonstrate the usage of maven and the problem it is solving.
 * 1.Maven is a build management tool which is used to resolve the dependencies problem.
 * 2.Maven tool comes with pom.xml file in which we can add GroupId,ArtifactId,Versionid of the dependencies and maven downloads all related dependencies.
 * 3.Dependencies here means .jar file which are necessary to run the application .
 * 4.Earlier, developers used to add .jar files manually to project path which are required to run application.
 * 5.In case if there are many dependencies if becomes tiring process.Here, maven optimises the process.
 * 6.There are three repositories from where maven fetches dependencies-
 *                               Local      Remote      Central
 *    Requires Internet            No        Yes         Yes
 *
 * 7.First maven checks dependencies in local system(.m2 directory) --->remote repository(settings.xml)(if present)------>central repository(https://repo.maven.apache.org/maven2/)
 * 8.Here, we have added dependency of L4_Calculator in the code in pom.xml
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);

            System.out.println(Calculator.add(1, 5));
            System.out.println(Calculator.multiply(10,5));
        }
    }
}