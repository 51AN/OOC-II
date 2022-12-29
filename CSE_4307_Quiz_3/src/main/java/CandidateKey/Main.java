package CandidateKey;

public class Main {
    public static void main(String[] args) {
        //to run the program, change directory of input.txt and output.txt below
        CandidateKeyFactory candidateKeyFactory = new CandidateKeyFactory("D:\\SWE-20\\CSE 4307 DBMS\\Assignment 3\\CSE_4307_Quiz_3\\Text Inputs\\IO_3\\input.txt");
        candidateKeyFactory.outputCandidateKeys("D:\\SWE-20\\CSE 4307 DBMS\\Assignment 3\\CSE_4307_Quiz_3\\Text Inputs\\IO_3\\output.txt");

    }

}
