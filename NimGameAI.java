package nimgameai;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NimGameAI extends JFrame implements ActionListener
{
    JPanel j1,j2,j3;
    ImageIcon img1,img2,img3;
    JLabel lk1,lk2,lk3,pla;
    JComboBox jcb,jcb1;
    String i[]={"1","2","3","4","5"};
    JPanel j4;
    Timer timer;
   
    ImageIcon im[]=new ImageIcon[6];
    
   
   NimGameAI()
   {
       setLayout(null);
       j1=new JPanel();
       j1.setBounds(0,0,1980,100);
       timer = new Timer(3000, new TimeHandler());
       add(j1);

       j1.setBackground(Color.gray);
       Label l1=new Label("NIM GAME");
       l1.setBounds(900,30,200,200);
       j1.add(l1);
       l1.setFont((new Font("Serif",Font.BOLD+Font.ITALIC,64)));
       l1.setForeground(Color.white);
       
       j2=new JPanel();
       j2.setBounds(0,900,1980,80);
       add(j2);
       j2.setBackground(Color.gray);
       
       j3=new JPanel();
       j3.setLayout(null);
       j3.setBounds(0,100,480,800);
       add(j3);
       j3.setBackground(Color.blue);
       j3.setBorder(BorderFactory.createLineBorder(Color.BLACK,9));
       
       String st[]={"A","B","C"};
       jcb=new JComboBox(st);
       j3.add(jcb);
       jcb.setBounds(40,150, 100, 50);
       jcb.setFont((new Font("Serif",Font.BOLD+Font.ITALIC,34)));
       jcb.addActionListener(this);
       
       
       jcb1=new JComboBox(i);
       j3.add(jcb1);
       jcb1.setBounds(220,150, 100, 50);
       jcb1.setFont((new Font("Serif",Font.BOLD+Font.ITALIC,34)));
       
       JButton j1=new JButton("Pick");
       j3.add(j1);
       j1.setBounds(110,300, 200, 50);
       j1.setFont((new Font("Cortado",Font.BOLD+Font.ITALIC,34)));
       j1.addActionListener(this);
       
       j4=new JPanel();
       j4.setLayout(null);
       j4.setBounds(480,100,1500,800);
       add(j4);
       j4.setBackground(Color.black);
    
       
       img1=new ImageIcon("F:\\Nim Game\\5.jpg");
       lk1=new JLabel(img1);
       lk1.setBounds(010,150,271,171);
       j4.add(lk1);
       
       img2=new ImageIcon("F:\\Nim Game\\4.jpg");
       lk2=new JLabel(img2);
       lk2.setBounds(520,150,271,171);
       j4.add(lk2);
       
       img3=new ImageIcon("F:\\Nim Game\\3.jpg");
       lk3=new JLabel(img3);
       lk3.setBounds(1050,150,271,171);
       j4.add(lk3);
       
       pla=new JLabel("Player 1 Chance");
       pla.setForeground(Color.white);
       pla.setBounds(480,500,500,200);
       j4.add(pla);
       pla.setFont((new Font("Cortado",Font.BOLD+Font.ITALIC,34)));
       
       
       setVisible(true);
       setSize(1980,1200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        im[0]=new ImageIcon("F:\\Nim Game\\0.jpg");
        im[1]=new ImageIcon("F:\\Nim Game\\1.jpg");
        im[2]=new ImageIcon("F:\\Nim Game\\2.jpg");
        im[3]=new ImageIcon("F:\\Nim Game\\3.jpg");
        im[4]=new ImageIcon("F:\\Nim Game\\4.jpg");
        im[5]=new ImageIcon("F:\\Nim Game\\5.jpg");
    
   }  // constructors
   int aiCounter=0;
   int move,radno,range;
   Random rn;
   int max=3,min=1;
   void artificial()
   {
       
       
       ///Final MOve algo
       if((p==q&&r==0)||(p==r&&q==0)||(r==q&&p==0)||(p==q&&p==r))//equal case ends
       {
           System.out.println("******************hey I am in Case1 Ai");
        move=ai;   
        aiCounter++;
        if(move<=k)
           {
              k=move;          
           }
          
       }
       if((p==1&&q==2&&r==3)||(p==1&&q==3&&r==2)||(p==2&&q==1&&r==3)||(p==2&&q==3&&r==1)||(p==3&&q==1&&r==2)||(p==3&&q==2&&r==1))
       {
         move=ai;
         aiCounter++;
         if(move<=k)
           {
              k=move;          
           }
          
                    System.out.println("*****************hey I am in Case2 Ai");
       }
       if(aiCounter!=0)
       {
                      move=ai;
                      System.out.println("hey I am in Don Ai***************");
                      if(move<=k)
                        {
                            k=move;          
                        }
          
       }
       if((p==0&&q==0)||(p==0&&r==0)||(q==0&&r==0))
       {
           k=r+p+q;
           System.out.println("*****************hey I am in Last Final Empty AIMOVE");
       }
       //Final Move algo Finished
       
          
       
   }
   int cp=0;//to handle k in computer function
   void aiN_1()
   {
       cp=0;
        rn=new Random();
        range=max;
        radno=rn.nextInt(range)+min;
        System.out.println("Hey this radno is "+radno);

       //n-1 move algo start 
       //Gadbad of radno in this
       /*if(((p!=q &&r==0)||(p!=r &&q==0)||(r!=q &&p==0)))//When one is zero and other two are not zero but are unequal
       {
           
       }
      */
       
       
       if(p==q&&p!=r)
       {
           cp++;
           if(r>p)
           {
           k=r-p;
           System.out.println("!!!!!!!!!!!!!!I am in if "+k);
           }
           else
           {
               k=r;
               System.out.println("!!!!!!!!!!!!!!I am in else "+k);
           }
         
           radno=3;
           System.out.println("###########I am in 3");
       }
       if(p==r&&p!=q)
       {
           cp++;
           if(q>p)
           {
           k=q-p;
           System.out.println("!!!!!!!!!!!!!!I am in if "+k);
           }
           else
           {
               k=q;
               System.out.println("!!!!!!!!!!!!!!I am in else "+k);
           }
           radno=2;
           System.out.println("###########I am in 2");           
       }
       if(q==r&&q!=p)
       {
           cp++;
           if(p>q)
           {
           k=p-q;
           System.out.println("!!!!!!!!!!!!!!I am in if "+k);
           }
           else
           {
               k=p;
               System.out.println("!!!!!!!!!!!!!!I am in else "+k);
           }
           
           radno=1;
           System.out.println("###########I am in 1");           
       }
       if((p==1&&q==2&&r!=3&&r!=0)||(p==1&&q==3&&r!=2&&r!=0)||(p==2&&q==1&&r!=3&&r!=0)||(p==3&&q==2&&r!=1&&r!=0)||(p==2&&q==3&&r!=1&&r!=0))//for set C
       {
           cp++;
           System.out.println("Respective values of p and q in 1 is "+p+" "+q);
           r=r-(6-(p+q));
           k=r;
           radno=3;
           System.out.println("DONDONDODNODNDODN1 and r:"+r);           
       }
      else if(((p==1&&r==2&&q!=3)||(p==1&&r==3&&q!=2)||(p==2&&r==1&&q!=3))&&q!=0)//for set B
       {
           cp++;
           System.out.println("Respective values of p and r in 2 is "+p+" "+r);
           q=q-(6-(r+p));
           k=q;
           radno=2;
           System.out.println("DONDONDODNODNDODN2 and K:"+k);
       }
      else if(((r==1&&q==2&&p!=3)||(r==1&&q==3&&p!=2)||(r==2&&q==1&&p!=3))&&p!=0)//for set A
       {
           cp++;
           System.out.println("Respective values of r and q in 3 is "+r+" "+q);
           p=p-(6-(r+q));
           k=p;
           radno=3;
           System.out.println("DONDONDODNODNDODN3 and K:"+k);
       }
       //n-1 algo finishs
   }
   int k;
   void computer()
   {                 
//        int max=3,min=1;
//        Random rn=new Random();
//        int range=max;
//        int radno;
//        radno=rn.nextInt(range)+min;
//        System.out.println("Hey this radno is "+radno);
        //This is Ai Part now
        
        this.aiN_1();
        
        //Ai part Completes
        
        if(p==0)
        {
              if(q==0)
              {
               radno=3;   
              }
              else if(r==0)
              {
                  radno=2;
              }
              else
              {
                  radno=2;
              }
              
        }
        if(q==0)
        {
              if(p==0)
              {
               radno=3;   
              }
              else if(r==0)
              {
                  radno=1;
              }
              else
              {
                  radno=3;
              }
        }
        if(r==0)
        {
              if(p==0)
              {
               radno=2;   
              }
            
              else if(q==0)
              {
                  radno=1;
              }
              else
              {
                  radno=2;
              }
        }
                       
               if(radno==1)
               {
                   System.out.println("Boss*******IN rad1 and k: "+k);
                   if(cp==0)
                   { 
                      k=rn.nextInt((p))+min;
                   }
                   
                   System.out.println(radno+"  i am in 1");
                   this.artificial();
                   
                   if(k==1)
                   {
                      count++;
                      a=1; 
                      for(int i=0;i<5;i++)
                      {
                        if(((lk1.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk1.setIcon(im[i]);
                          break;
                        }
                      }
                   }
                   if(k==2)
                   {
                   //    radno=rn.nextInt((p))+min;
                   System.out.println(radno+"he i am in 2");
                       count++;
                       a=2;
                      for(int i=0;i<5;i++)
                      {
                        if(((lk1.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk1.setIcon(im[i-1]);
                          break;
                        }
                      }
                   }
                   if(k==3)
                   {
                     //radno=rn.nextInt((p))+min;
                     System.out.println(radno+"he i am in 3");
                       count++;
                       a=3;
                      for(int i=0;i<5;i++)
                      {
                        if(((lk1.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk1.setIcon(im[i-2]);
                          break;
                        }
                      }
                   }
                   if(k==4)
                   {
                    //radno=rn.nextInt((p))+min;
                    System.out.println(radno+"he i am in 4");
                       count++;
                       a=4;
                      for(int i=0;i<5;i++)
                      {
                        if(((lk1.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk1.setIcon(im[i-3]);
                          break;
                        }
                      }
                   }
                      if(k==5)
                   {
                    //   radno=rn.nextInt((p))+min;
                       System.out.println(radno+"he i am in 5");
                       count++;
                       a=5;
                      for(int i=0;i<5;i++)
                      {
                        if(((lk1.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk1.setIcon(im[i-4]);
                          break;
                        }
                      }
                   }
             
             
             p-=a;
             if(jcb.getSelectedItem().equals("A"))
             {
                 jcb1.removeAllItems();
               for(int m=0;m<p;m++)
               {
                 jcb1.addItem(i[m]);
               }
                 System.out.println("Hey I am in A Selected items");
             }
                      
        }
               if(radno==2)
               {
                   if(cp==0)
                   {
                     System.out.println("Boss*******IN rad2 and k: "+k);
                    k=rn.nextInt((q))+min;
                   }
                    this.artificial();
                   if(k==1)
                   {
                      
                   System.out.println(radno+"he i am in 1");
                       count++;
                       b=1;
                      for(int i=0;i<4;i++)
                      {
                        if(((lk2.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk2.setIcon(im[i]);
                          break;
                        }
                      }
                   }
                   if(k==2)
                   {
                     //  radno=rn.nextInt((q))+min;
                   System.out.println(radno+"he i am in 2");
                       count++;
                       b=2;
                      for(int i=0;i<4;i++)
                      {
                        if(((lk2.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk2.setIcon(im[i-1]);
                          break;
                        }
                      }
                   }
                   if(k==3)
                   {
                       //radno=rn.nextInt((q))+min;
                   System.out.println(radno+"he i am in 3");
                       count++;
                       b=3;
                      for(int i=0;i<4;i++)
                      {
                        if(((lk2.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk2.setIcon(im[i-2]);
                          break;
                        }
                      }
                   }
                   if(k==4)
                   {
                       //radno=rn.nextInt((q))+min;
                   System.out.println(radno+"he i am in 4");
                       count++;
                       b=4;
                      for(int i=0;i<4;i++)
                      {
                        if(((lk2.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk2.setIcon(im[i-3]);
                          break;
                        }
                      }
                   }
             
             q-=b;
             if(jcb.getSelectedItem().equals("B"))
             {
                 jcb1.removeAllItems();
                 for(int m=0;m<q;m++)
                {
                 jcb1.addItem(i[m]);
                }
                 System.out.println("Hey I am in B Selected items");
             }     
                      
               }
               if(radno==3)
               {
                   if(cp==0)
                   {
                   k=rn.nextInt((r))+min;
                       System.out.println("Boss*******IN rad3 and k: "+k);
                   }
                   this.artificial();
                   if(k==1)
                   {
                       
                   System.out.println(radno+"he i am in 3");
                       count++;
                       c=1;
                      for(int i=0;i<3;i++)
                      {
                        if(((lk3.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk3.setIcon(im[i]);
                          break;
                        }
                      }
                   }
                   if(k==2)
                   {
                    //   radno=rn.nextInt((r))+min;
                   System.out.println(radno+"he i am in 2");
                       count++;
                       c=2;
                      for(int i=0;i<3;i++)
                      {
                        if(((lk3.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk3.setIcon(im[i-1]);
                          break;
                        }
                      }
                   }
                   if(k==3)
                   {
                      // radno=rn.nextInt((r))+min;
                   System.out.println(radno+"he i am in 3");
                       count++;
                       c=3;
                      for(int i=0;i<3;i++)
                      {
                        if(((lk3.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk3.setIcon(im[i-2]);
                          break;
                        }
                      }
                   }
              
             r-=c;
             if(jcb.getSelectedItem().equals("C"))
             {
                jcb1.removeAllItems();
               for(int m=0;m<r;m++)
               {
                 jcb1.addItem(i[m]);
               }
               System.out.println("Hey I am in C Selected items");
             }
                      
        }
               cp=0;
       
       if(count%2==0)
       {
           pla.setText("Player 1 Chance");
           if(((lk1.getIcon()).toString()).equals(im[0].toString())&&((lk2.getIcon()).toString()).equals(im[0].toString())&&((lk3.getIcon()).toString()).equals(im[0].toString()))
       {
           pla.setText("Computer Won");
       }
         
       }
       else
       {
           pla.setText("Player 2 chance");
             if(((lk1.getIcon()).toString()).equals(im[0].toString())&&((lk2.getIcon()).toString()).equals(im[0].toString())&&((lk3.getIcon()).toString()).equals(im[0].toString()))
          {
           pla.setText("Player 1 Won");
          }
       }
   } // end of computer
   
   class TimeHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
               computer();
               timer.stop();
      }   
   }
   
   int a=0,b=0,c=0,j=5,x=4,l=3,p=5,q=4,r=3,count=0,ai=0;
   public void actionPerformed(ActionEvent e)
   {
        if(e.getActionCommand().equals("comboBoxChanged"))
        {
            System.out.println("Change in Combo");
          if(jcb.getSelectedItem().equals("A"))
         {
             jcb1.removeAllItems();
             j-=a;
             for(int m=0;m<j;m++)
             {
                 jcb1.addItem(i[m]);
             }
             a=0;
         }
        if(jcb.getSelectedItem().equals("B"))
         {
             jcb1.removeAllItems();
            
             x-=b;
             for(int m=0;m<x;m++)
             {
                 jcb1.addItem(i[m]);
             }
             b=0;
         }

        if(jcb.getSelectedItem().equals("C"))
         {
             jcb1.removeAllItems();
            
             l-=c;
             for(int m=0;m<l;m++)
             {
                 jcb1.addItem(i[m]);
             }
             c=0;
          }
       }
       if(e.getActionCommand().equals("Pick"))
          {
              
               int k=Integer.parseInt((String)jcb1.getSelectedItem());
               System.out.println(k); 
               ai=k;
               if(jcb.getSelectedItem().equals("A"))
               {
                   
                   if(k==1)
                   {
                      count++;
                      a=1; 
                      for(int i=0;i<5;i++)
                      {
                        if(((lk1.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk1.setIcon(im[i]);
                          break;
                        }
                      }
                   }
                   if(k==2)
                   {
                       count++;
                       a=2;
                      for(int i=0;i<5;i++)
                      {
                        if(((lk1.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk1.setIcon(im[i-1]);
                          break;
                        }
                      }
                   }
                   if(k==3)
                   {
                       count++;
                       a=3;
                      for(int i=0;i<5;i++)
                      {
                        if(((lk1.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk1.setIcon(im[i-2]);
                          break;
                        }
                      }
                   }
                   if(k==4)
                   {
                       count++;
                       a=4;
                      for(int i=0;i<5;i++)
                      {
                        if(((lk1.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk1.setIcon(im[i-3]);
                          break;
                        }
                      }
                   }
                      if(k==5)
                   {
                       count++;
                       a=5;
                      for(int i=0;i<5;i++)
                      {
                        if(((lk1.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk1.setIcon(im[i-4]);
                          break;
                        }
                      }
                   }
             
             jcb1.removeAllItems();
             p-=a;
             for(int m=0;m<p;m++)
             {
                 jcb1.addItem(i[m]);
                 System.out.println("Value of m in A is "+m);
             }     
                      //a=0;
         }
               if(jcb.getSelectedItem().equals("B"))
               {
                   
                   if(k==1)
                   {
                       count++;
                       b=1;
                      for(int i=0;i<4;i++)
                      {
                        if(((lk2.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk2.setIcon(im[i]);
                          break;
                        }
                      }
                   }
                   if(k==2)
                   {
                       count++;
                       b=2;
                      for(int i=0;i<4;i++)
                      {
                        if(((lk2.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk2.setIcon(im[i-1]);
                          break;
                        }
                      }
                   }
                   if(k==3)
                   {
                       count++;
                       b=3;
                      for(int i=0;i<4;i++)
                      {
                        if(((lk2.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk2.setIcon(im[i-2]);
                          break;
                        }
                      }
                   }
                   if(k==4)
                   {
                       count++;
                       b=4;
                      for(int i=0;i<4;i++)
                      {
                        if(((lk2.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk2.setIcon(im[i-3]);
                          break;
                        }
                      }
                   }
             jcb1.removeAllItems();
             q-=b;
             for(int m=0;m<q;m++)
             {
                 jcb1.addItem(i[m]);
                 System.out.println("Value of m in B is "+m);
                 
             }     
                 //b=0;     
          }
               if(jcb.getSelectedItem().equals("C"))
               {
                   if(k==1)
                   {
                       count++;
                       c=1;
                      for(int i=0;i<3;i++)
                      {
                        if(((lk3.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk3.setIcon(im[i]);
                          break;
                        }
                      }
                   }
                   if(k==2)
                   {
                       count++;
                       c=2;
                      for(int i=0;i<3;i++)
                      {
                        if(((lk3.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk3.setIcon(im[i-1]);
                          break;
                        }
                      }
                   }
                   if(k==3)
                   {
                       count++;
                       c=3;
                      for(int i=0;i<3;i++)
                      {
                        if(((lk3.getIcon()).toString()).equals(im[i+1].toString()))
                        { //See this as as cant have any other oprtion to change image 
                          lk3.setIcon(im[i-2]);
                          break;
                        }
                      }
                   }
              jcb1.removeAllItems();
             r-=c;
             for(int m=0;m<r;m++)
             {
                 jcb1.addItem(i[m]);
             }     
                    // c=0; 
              }
              timer.start();
          }
       
       if(count%2==0)
       {
           pla.setText("Player 1 Chance");
           if(((lk1.getIcon()).toString()).equals(im[0].toString())&&((lk2.getIcon()).toString()).equals(im[0].toString())&&((lk3.getIcon()).toString()).equals(im[0].toString()))
       {
           pla.setText("Computer win");
       }
         
       }
       else
       {
           pla.setText("Computer Chance");
           //pla.setText("Player 2 chance");
             if(((lk1.getIcon()).toString()).equals(im[0].toString())&&((lk2.getIcon()).toString()).equals(im[0].toString())&&((lk3.getIcon()).toString()).equals(im[0].toString()))
          {
           pla.setText("Player 1 Won");
          }
       }
   }
   
   public static void main(String args[])
   {
       new NimGameAI();
   }
    
}