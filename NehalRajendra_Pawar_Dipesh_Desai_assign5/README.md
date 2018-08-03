Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code

ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=3 
-Darg2=3
(3th argument 1=FILE_PROCESSOR 2=CONSTRUCTOR 3=AllStates)

-----------------------------------------------------------------------

## To create tarball for submission
ant -buildfile src/build.xml tarzip or tar -zcvf NehalRajendra_Pawar_Dipesh_Desai_assign5.tar.gz NehalRajendra_Pawar_Dipesh_Desai_assign5

-----------------------------------------------------------------------

## Justification of Design Pattern usage: 
We have used Visitor Design pattern because it allowed us represent an operation to be performed on the nodes of the tree.  So that we could add new operation without changing the class. Many operations need to be performed on node, to avoid "polluting" the node classes with these operations we used visitors that work on same object by passing the visitor as parameter. 

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.

[Date: 8/3/2018]

-----------------------------------------------------------------------
-----------------------------------------------------------------------
