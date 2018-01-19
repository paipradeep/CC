/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/ 
    boolean checkBST(Node root,int lowerlimit,int upperlimit){
      //The upper limit and lower limit check is to eliminate certain critical cases
        if(root == null)
            return true;
        if(root.data<=lowerlimit || root.data>=upperlimit)
            return false;
        return checkBST(root.left,lowerlimit,root.data)&&checkBST(root.right,root.data,upperlimit);
    }
  
    boolean checkBST(Node root) {
        int INF=10000,NEGINF=-10000;
        return checkBST(root,NEGINF,INF);
    }
