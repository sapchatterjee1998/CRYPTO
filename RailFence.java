import java.util.*;
class RailFenceBasic{
 int key;

 
 String Encryption(String plainText,int key)throws Exception
 {
  int r=key,len=plainText.length();
  int c=key;
  char mat[][]=new char[r][c];
  int k=0;
 
  String cipherText="";
 
  for(int i=0;i< c;i++)
  {
   for(int j=0;j< r;j++)
   {
    if(k!=len)
     mat[j][i]=plainText.charAt(k++);
    else
     mat[j][i]='X';
   }
  }
  for(int i=0;i< r;i++)
  {
   for(int j=0;j< c;j++)
   {
    cipherText+=mat[i][j];
   }
  }
  return cipherText;
 }
 
 }


class RailFence{
 public static void main(String args[])throws Exception
 {
  RailFenceBasic rf=new RailFenceBasic();
                Scanner scn=new Scanner(System.in);
                int key;
 
                String plainText,cipherText;
               
                System.out.println("Enter plain text:");
                plainText=scn.nextLine();
               
                System.out.println("Enter the key");
                key=scn.nextInt();
               
  cipherText=rf.Encryption(plainText,key);
  System.out.println("Encrypted text is:\n"+cipherText);
               
                
 }
}
