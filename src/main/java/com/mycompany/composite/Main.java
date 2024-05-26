
package com.mycompany.composite;

public class Main {

    public static void main(String[] args) {
        
        Composite project = new Composite("MiProyecto");

        Composite srcPackages = new Composite("\tSource Packages");
        project.add(srcPackages);

        Composite mycompany = new Composite("\t\tmycompany");
        srcPackages.add(mycompany);

        Composite com = new Composite("\t\t\tcom");
        mycompany.add(com);

        com.add(new Leaf("\t\t\tMain.java"));
        com.add(new Leaf("\t\t\tUtils.java"));

        project.show();
    }
}
