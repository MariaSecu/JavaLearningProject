package md.Maria.gitworkflow;

public class GitWorkflow {
    public static void main(String[] args) {

        // Declararea si initializarea pasilor pentru executia unui 'git flow'//

        String step1 = "Perform git stash - to store the uncommitted changes";
        String step2 = "Perform git checkout master - to move to the local master branch";
        String step3 = "Perform git fetch command - to fetch the origin branches";
        String step4 = "Perform git pull command - to fetch and download content from the origin/master and immediately update the local master to match that content.";
        String step5 = "Perform git checkout -b new_branch_name command - to create and instantly move to a new branch, that is identical to local master branch";
        String step6 = "Add your changes that are related to the task.";
        String step7 = "Review your changes and check your code before committing then.";
        String step8 = "Execute git commit by using the IntelliJ Idea interface, where you can select what changes you want to commit.";
        String step9 = "Once all the changes, are committed, execute a git push command by using CTRL+ALT+K hot keys";
        String step10 = "The committed changes are pushed to an origin branch with the same name, navigate to the GitHub branch";
        String step11 = "Create a Pull Request from origin/new_branch_name into origin/master";
        String step12 = "Add the Pull Request details - name, description and request review from your colleagues";
        String step13 = "If you collect at least 2 approvals from your colleagues then merge the branch";
        String step14 = "After that, the origin/master contains the latest changes and the origin/new_branch_name can be deleted";
        String step15 = "Do not forget that locally you are still on the new branch name, it's good to move back to master";
        String step16 = "However, the local master branch does not have the latest changes, therefore perform a git fetch and git pull";


        //Afisarea in consola a pasilor definiti in prima etapa//
        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
    }


}
