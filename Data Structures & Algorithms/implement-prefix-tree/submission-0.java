class Node{
    Node [] children;
    boolean eow;
    Node(){
    children= new Node[26];
    for(int i=0;i<26;i++){
        children[i]=null;
        eow=false;
    }
    }
}
class PrefixTree {
    static Node root;

    public PrefixTree() {
         root = new Node();
    }

    public void insert(String word) {
               Node tem =root;
              for(int i=0;i<word.length();i++){
         int index= word.charAt(i)-'a';
         if(tem.children[index]==null){
             tem.children[index]=new Node();
         }
         if(i==word.length()-1) tem.children[index].eow=true;
         tem=tem.children[index];
     }
    }

    public boolean search(String word) {
           Node tem=root;
     for(int i=0;i<word.length();i++){
         int index= word.charAt(i)-'a';
         if(tem.children[index]==null) return false;
         if(i==word.length()-1 && tem.children[index].eow==false)return false;
         tem=tem.children[index];
     }
     return true;
    }

    public boolean startsWith(String word) {

   Node tem=root;
     for(int i=0;i<word.length();i++){
         int index= word.charAt(i)-'a';
         if(tem.children[index]==null) return false;
         //if(i==word.length()-1 && tem.children[index].eow==false)return false;
         tem=tem.children[index];
     }
     return true;

    }
}
