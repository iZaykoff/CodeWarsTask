package tasks.whoLikesIt;

class Solution {

    static String whoLikesIt(String... names) {
        String conclusion;

        switch (names.length) {
            case 0:
                conclusion = "no one likes this";
                break;
            case 1:
                conclusion = names[0] + " likes this";
                break;
            case 2:
                conclusion = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                conclusion = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                conclusion = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
                break;
        }
        //Do your magic here
        return conclusion;
    }
}