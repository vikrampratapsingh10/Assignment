class Graduate{
  public static void main(String args[]){
    String semFirstSubject[] = {"Math","Stat. Method","Physics","PC-Software","C-prog","English","C-practicle","PC-practicle"};
    String semSecondSubject[]= {"OS","Adv. Maths","Organization Behav.","Hindi","English","DBMS","OS - P","DBMS - P"};
    String semThirdSubject[] = {"CPP","Digital C & E","DS","Communication Skill","Sta.-ii","Discrete Math","CPP-P","DS-P"};
    String semFourthSubject[] = {"CONUM","SE","Java","Enter.","Unix","Envi.","Java-P","Unix-P"};
    String semFivthSubject[] = {"Algebra","Network","HV","IT-Trains","Cloud","Data Science","DS-p","Networking-P"};
    String semSixthSubject[] = {"Ope. Rea.","Inter. & Web","Graphics","PPM","Web-Designing","Project","Graphics-P","Designing-P"};
    
    int marks1[] = new int[8];
    int marks2[] = new int[8];
    int marks3[] = new int[8];
    int marks4[] = new int[8];
    int marks5[] = new int[8];
    int marks6[] = new int[8];
    
    boolean firstSemAtkt[] = new boolean[8];
    boolean secondSemAtkt[] = new boolean[8];
    boolean thirdSemAtkt[] = new boolean[8];
    boolean fourthSemAtkt[] = new boolean[8];
    boolean fivthSemAtkt[] = new boolean[8];
    boolean sixthSemAtkt[] = new boolean[8];   
    
    java.util.Scanner sc = new java.util.Scanner(System.in); 
    int atktCounter = 0;
    boolean loopCounter;
    do{
       loopCounter = false;
       atktCounter=0;
       firstSemAtkt = new boolean[8];
       secondSemAtkt = new boolean[8];
       for(int i=0; i<6; i++){
         System.out.println("Enter Marks Of "+semFirstSubject[i]);
         marks1[i] = sc.nextInt();
         if(marks1[i] < 0 || marks1[i]>50){
          i--;
          System.out.println("Invalid Marks. please re-enter");
          continue;
         }
         if(marks1[i]<17){
           atktCounter++;
           firstSemAtkt[i] = true;
         }
       }
       for(int i=6; i<8; i++){
         System.out.println("Enter Marks of "+semFirstSubject[i]);
         marks1[i] = sc.nextInt();
         if(marks1[i]<0 || marks1[i]>25){
           i--;
           System.out.println("Invalid Marks. please re-enter");
           continue;
         }
         if(marks1[i]<8){
           atktCounter++;
           firstSemAtkt[i] = true;
         }
       }
       System.out.println("Total Atkt : "+atktCounter);

       if(atktCounter >= 3){
        loopCounter = true;
        System.out.println("You have year back.");
        atktCounter = 0; 
       }
       else{
                System.out.println("You Are Promoted in 2-semester");
                // Display First Semester MarkSheet
                
                // Re-Exam For Atkt Subjects
                for(int i=0; i<firstSemAtkt.length; i++){
                  if(firstSemAtkt[i]){
                    System.out.println("Enter The Marks of "+semFirstSubject[i]);
                    marks1[i] = sc.nextInt();
                    if(i<6){
                      if(marks1[i]<0 || marks1[i]>50){
                        i--;
                        System.out.println("Invalid Marks. please re-enter");
                        continue;
                      }
                      if(marks1[i]>17){
                        atktCounter--;
                        firstSemAtkt[i] = false;
                      }
                    }
                    else{
                      if(marks1[i]<0 || marks1[i]>25){
                        i--;
                        System.out.println("Invalid Marks. please re-enter");
                        continue;
                      }
                      if(marks1[i]>8){
                        atktCounter--;
                        firstSemAtkt[i] = false;
                      }
                    }
                  }
                }    
                // second semester theory
                for(int i=0; i<6; i++){
                  System.out.println("Enter Marks Of "+semSecondSubject[i]);
                  marks2[i] = sc.nextInt();
                  if(marks2[i]<0 || marks2[i]>50){
                    i--;
                    System.out.println("Invalid Marks. please re-enter");
                    continue;
                  }
                  if(marks2[i] < 17){
                    secondSemAtkt[i] = true;
                    atktCounter++;              
                  }
                }
                // second Semester Practicles
                for(int i=6; i<8; i++){
                  System.out.println("Enter Marks Of "+semSecondSubject[i]);
                  marks2[i] = sc.nextInt();
                  if(marks2[i]<0 || marks2[i]>25){
                    i--;
                    System.out.println("Invalid Marks. please re-enter");
                    continue;
                  }
                  if(marks2[i] < 8){
                    secondSemAtkt[i] = true;
                    atktCounter++;              
                  }
                } 
                System.out.println("After Second Semester : "+atktCounter);
                if(atktCounter >=3){
                  loopCounter = true;
                  System.out.println("You have year back");
                  atktCounter = 0;
                }
                
                else{
                  // Display second semester MarkSheet
                  boolean secondYearLoopCounter = false;
                  do{
                      secondYearLoopCounter = false;
                      thirdSemAtkt = new boolean[8];
                      fourthSemAtkt = new boolean[8];


                      System.out.println("You Are Promoted In 3-semeseter"); 
                      // Checking For 1-sem Atkt Exam..
                      for(int i=0; i<firstSemAtkt.length; i++){
                        if(firstSemAtkt[i]){
                        System.out.println("Enter The Marks of "+semFirstSubject[i]);
                        marks1[i] = sc.nextInt();
                        if(i<6){
                          if(marks1[i]<0 || marks1[i]>50){
                            i--;
                            System.out.println("Invalid Marks. please re-enter");
                            continue;
                          }
                          if(marks1[i]>17){
                            atktCounter--;
                            firstSemAtkt[i] = false;
                          }
                        }
                        else{
                          if(marks1[i]<0 || marks1[i]>25){
                            i--;
                            System.out.println("Invalid Marks. please re-enter");
                            continue;
                          }
                          if(marks1[i]>8){
                            atktCounter--;
                            firstSemAtkt[i] = false;
                          }
                        }
                        }
                      }       
                      // Checking For 2-sem Atkt Exam..
                      for(int i=0; i<secondSemAtkt.length; i++){
                        if(secondSemAtkt[i]){
                        System.out.println("Enter The Marks of "+semSecondSubject[i]);
                        marks2[i] = sc.nextInt();
                        if(i<6){
                          if(marks2[i]<0 || marks2[i]>50){
                            i--;
                            System.out.println("Invalid Marks. please re-enter");
                            continue;
                          }
                          if(marks2[i]>17){
                            atktCounter--;
                            secondSemAtkt[i] = false;
                          }
                        }
                        else{
                          if(marks2[i]<0 || marks2[i]>25){
                            i--;
                            System.out.println("Invalid Marks. please re-enter");
                            continue;
                          }
                          if(marks2[i]>8){
                            atktCounter--;
                            secondSemAtkt[i] = false;
                          }
                        }
                        }
                      }
                      // Exam For 3 semeseter
                      for(int i=0; i<6; i++){
                        System.out.println("Enter Marks Of "+semThirdSubject[i]);
                        marks3[i] = sc.nextInt();
                        if(marks3[i] < 0 || marks3[i]>50){
                            i--;
                            System.out.println("Invalid Marks. please re-enter");
                            continue;
                        }
                        if(marks3[i]<17){
                          atktCounter++;
                          thirdSemAtkt[i] = true;
                        }
                      }
                      for(int i=6; i<8; i++){
                        System.out.println("Enter Marks of "+semThirdSubject[i]);
                        marks3[i] = sc.nextInt();
                        if(marks3[i]<0 || marks3[i]>25){
                            i--;
                            System.out.println("Invalid Marks. please re-enter");
                            continue;
                        }
                        if(marks3[i]<8){
                            atktCounter++;
                            thirdSemAtkt[i] = true;
                        }
                      } 

                      System.out.println("After 3rd Semester Exam : "+atktCounter);
                      if(atktCounter >=3){
                        secondYearLoopCounter = true;
                        System.out.println("You have 2nd year back");
                        atktCounter = 0;
                      }
                      else{
                        // Display marksheet 3rd semester
                        System.out.println("You are promoted in 4th semeseter");
                        // Re- exam for 1 sem atkt
                        for(int i=0; i<firstSemAtkt.length; i++){
                          if(firstSemAtkt[i]){
                              System.out.println("Enter The Marks of "+semFirstSubject[i]);
                              marks1[i] = sc.nextInt();
                              if(i<6){
                                if(marks1[i]<0 || marks1[i]>50){
                                  i--;
                                  System.out.println("Invalid Marks. please re-enter");
                                  continue;
                                }
                                if(marks1[i]>17){
                                  atktCounter--;
                                  firstSemAtkt[i] = false;
                                }
                              }
                              else{
                                  if(marks1[i]<0 || marks1[i]>25){
                                    i--;
                                    System.out.println("Invalid Marks. please re-enter");
                                    continue;
                                  }
                                  if(marks1[i]>8){
                                      atktCounter--;
                                      firstSemAtkt[i] = false;
                                  }
                              }
                          }
                        }                      
                        
                        // Re-exam for 2 sem atkt
                        for(int i=0; i<secondSemAtkt.length; i++){
                          if(secondSemAtkt[i]){
                            System.out.println("Enter The Marks of "+semSecondSubject[i]);
                            marks2[i] = sc.nextInt();
                            if(i<6){
                                if(marks2[i]<0 || marks2[i]>50){
                                  i--;
                                  System.out.println("Invalid Marks. please re-enter");
                                  continue;
                                }
                                if(marks2[i]>17){
                                  atktCounter--;
                                  secondSemAtkt[i] = false;
                                }
                            }
                            else{
                                if(marks2[i]<0 || marks2[i]>25){
                                    i--;
                                    System.out.println("Invalid Marks. please re-enter");
                                    continue;
                                }
                                if(marks2[i]>8){
                                  atktCounter--;
                                  secondSemAtkt[i] = false;
                                }
                            }
                          }
                        } 
                        
                        for(int i=0; i<thirdSemAtkt.length; i++){
                          if(thirdSemAtkt[i]){
                            System.out.println("Enter The Marks of "+semThirdSubject[i]);
                            marks3[i] = sc.nextInt();
                            if(i<6){
                                if(marks3[i]<0 || marks3[i]>50){
                                  i--;
                                  System.out.println("Invalid Marks. please re-enter");
                                  continue;
                                }
                                if(marks3[i]>17){
                                  atktCounter--;
                                  thirdSemAtkt[i] = false;
                                }
                            }
                            else{
                                if(marks3[i]<0 || marks3[i]>25){
                                    i--;
                                    System.out.println("Invalid Marks. please re-enter");
                                    continue;
                                }
                                if(marks3[i]>8){
                                  atktCounter--;
                                  thirdSemAtkt[i] = false;
                                }
                            }
                          }
                        }
                        // Exam for 4th semester
                        
                        for(int i=0; i<6; i++){
                          System.out.println("Inside 4th semester subject..............");
                          System.out.println("Enter Marks Of "+semFourthSubject[i]);
                          marks4[i] = sc.nextInt();
                          if(marks4[i] < 0 || marks4[i]>50){
                            i--;
                            System.out.println("Invalid Marks. please re-enter");
                            continue;
                          }
                          if(marks4[i]<17){
                            atktCounter++;
                            fourthSemAtkt[i] = true;
                          }
                        }
                        for(int i=6; i<8; i++){
                          System.out.println("Enter Marks of "+semFourthSubject[i]);
                          marks4[i] = sc.nextInt();
                          if(marks4[i]<0 || marks4[i]>25){
                            i--;
                            System.out.println("Invalid Marks. please re-enter");
                            continue;
                          }
                          if(marks4[i]<8){
                            atktCounter++;
                            fourthSemAtkt[i] = true;
                          }
                        }
                        System.out.println("After 4th Semester Exam : "+atktCounter); 
                        if(atktCounter >= 3){
                          secondYearLoopCounter = true;
                          System.out.println("You have 2nd year back");
                          atktCounter = 0;
                        }
                        else{
                          System.out.println("You are promoted in 5th semester");
                          boolean thirdYearLoopCouter = false;
                          do{
                            thirdYearLoopCouter = false;
                            // Re- exam for 1 sem atkt
                            fivthSemAtkt = new boolean[8];
                            sixthSemAtkt = new boolean[8];
                            for(int i=0; i<firstSemAtkt.length; i++){
                              if(firstSemAtkt[i]){
                                  System.out.println("Enter The Marks of "+semFirstSubject[i]);
                                  marks1[i] = sc.nextInt();
                                  if(i<6){
                                    if(marks1[i]<0 || marks1[i]>50){
                                      i--;
                                      System.out.println("Invalid Marks. please re-enter");
                                      continue;
                                    }
                                    if(marks1[i]>17){
                                      atktCounter--;
                                      firstSemAtkt[i] = false;
                                    }
                                  }
                                  else{
                                      if(marks1[i]<0 || marks1[i]>25){
                                        i--;
                                        System.out.println("Invalid Marks. please re-enter");
                                        continue;
                                      }
                                      if(marks1[i]>8){
                                          atktCounter--;
                                          firstSemAtkt[i] = false;
                                      }
                                  }
                              }
                            }                      
                            
                            // Re-exam for 2 sem atkt
                            for(int i=0; i<secondSemAtkt.length; i++){
                              if(secondSemAtkt[i]){
                                System.out.println("Enter The Marks of "+semSecondSubject[i]);
                                marks2[i] = sc.nextInt();
                                if(i<6){
                                    if(marks2[i]<0 || marks2[i]>50){
                                      i--;
                                      System.out.println("Invalid Marks. please re-enter");
                                      continue;
                                    }
                                    if(marks2[i]>17){
                                      atktCounter--;
                                      secondSemAtkt[i] = false;
                                    }
                                }
                                else{
                                    if(marks2[i]<0 || marks2[i]>25){
                                        i--;
                                        System.out.println("Invalid Marks. please re-enter");
                                        continue;
                                    }
                                    if(marks2[i]>8){
                                      atktCounter--;
                                      secondSemAtkt[i] = false;
                                    }
                                }
                              }
                            } 
                            // Re-exam for 3 sem atkt
                            for(int i=0; i<thirdSemAtkt.length; i++){
                              if(thirdSemAtkt[i]){
                                System.out.println("Enter The Marks of "+semThirdSubject[i]);
                                marks3[i] = sc.nextInt();
                                if(i<6){
                                    if(marks3[i]<0 || marks3[i]>50){
                                      i--;
                                      System.out.println("Invalid Marks. please re-enter");
                                      continue;
                                    }
                                    if(marks3[i]>17){
                                      atktCounter--;
                                      thirdSemAtkt[i] = false;
                                    }
                                }
                                else{
                                    if(marks3[i]<0 || marks3[i]>25){
                                        i--;
                                        System.out.println("Invalid Marks. please re-enter");
                                        continue;
                                    }
                                    if(marks3[i]>8){
                                      atktCounter--;
                                      thirdSemAtkt[i] = false;
                                    }
                                }
                              }
                            }    
                            // Re-exam for 4th sem atkt
                            for(int i=0; i<fourthSemAtkt.length; i++){
                              if(fourthSemAtkt[i]){
                                System.out.println("Enter The Marks of "+semFourthSubject[i]);
                                marks4[i] = sc.nextInt();
                                if(i<6){
                                    if(marks4[i]<0 || marks4[i]>50){
                                      i--;
                                      System.out.println("Invalid Marks. please re-enter");
                                      continue;
                                    }
                                    if(marks4[i]>17){
                                      atktCounter--;
                                      fourthSemAtkt[i] = false;
                                    }
                                }
                                else{
                                    if(marks4[i]<0 || marks4[i]>25){
                                        i--;
                                        System.out.println("Invalid Marks. please re-enter");
                                        continue;
                                    }
                                    if(marks4[i]>8){
                                      atktCounter--;
                                      fourthSemAtkt[i] = false;
                                    }
                                }
                              }
                            }
                            // Exam for 5th semester
                            for(int i=0; i<6; i++){
                              System.out.println("Enter Marks Of "+semFivthSubject[i]);
                              marks5[i] = sc.nextInt();
                              if(marks5[i] < 0 || marks5[i]>50){
                                i--;
                                System.out.println("Invalid Marks. please re-enter");
                                continue;
                              }
                              if(marks5[i]<17){
                                  atktCounter++;
                                  fivthSemAtkt[i] = true;
                                }
                            }
                            for(int i=6; i<8; i++){
                              System.out.println("Enter Marks of "+semFivthSubject[i]);
                              marks5[i] = sc.nextInt();
                              if(marks5[i]<0 || marks5[i]>25){
                                i--;
                                System.out.println("Invalid Marks. please re-enter");
                                continue;
                              }
                              if(marks5[i]<8){
                                atktCounter++;
                                fivthSemAtkt[i] = true;
                              }
                            }
                            System.out.println("After 5th Semester Exam : "+atktCounter);
                            if(atktCounter >=3){
                              System.out.println("You have 3rd yeard back");
                              thirdYearLoopCouter = true;
                              atktCounter = 0;
                            }
                            else{
                              // Display 5th semester marksheet
                              System.out.println("You are promoted in 6th semester");
                              //------------------------------------
                              
                              // Re- exam for 1 sem atkt
                              for(int i=0; i<firstSemAtkt.length; i++){
                              if(firstSemAtkt[i]){
                                  System.out.println("Enter The Marks of "+semFirstSubject[i]);
                                  marks1[i] = sc.nextInt();
                                  if(i<6){
                                    if(marks1[i]<0 || marks1[i]>50){
                                      i--;
                                      System.out.println("Invalid Marks. please re-enter");
                                      continue;
                                    }
                                    if(marks1[i]>17){
                                      atktCounter--;
                                      firstSemAtkt[i] = false;
                                    }
                                  }
                                  else{
                                      if(marks1[i]<0 || marks1[i]>25){
                                        i--;
                                        System.out.println("Invalid Marks. please re-enter");
                                        continue;
                                      }
                                      if(marks1[i]>8){
                                          atktCounter--;
                                          firstSemAtkt[i] = false;
                                      }
                                  }
                              }
                              }                      
                            
                              // Re-exam for 2 sem atkt
                              for(int i=0; i<secondSemAtkt.length; i++){
                              if(secondSemAtkt[i]){
                                System.out.println("Enter The Marks of "+semSecondSubject[i]);
                                marks2[i] = sc.nextInt();
                                if(i<6){
                                    if(marks2[i]<0 || marks2[i]>50){
                                      i--;
                                      System.out.println("Invalid Marks. please re-enter");
                                      continue;
                                    }
                                    if(marks2[i]>17){
                                      atktCounter--;
                                      secondSemAtkt[i] = false;
                                    }
                                }
                                else{
                                    if(marks2[i]<0 || marks2[i]>25){
                                        i--;
                                        System.out.println("Invalid Marks. please re-enter");
                                        continue;
                                    }
                                    if(marks2[i]>8){
                                      atktCounter--;
                                      secondSemAtkt[i] = false;
                                    }
                                }
                              }
                              } 
                              // Re-exam for 3 sem atkt
                              for(int i=0; i<thirdSemAtkt.length; i++){
                              if(thirdSemAtkt[i]){
                                System.out.println("Enter The Marks of "+semThirdSubject[i]);
                                marks3[i] = sc.nextInt();
                                if(i<6){
                                    if(marks3[i]<0 || marks3[i]>50){
                                      i--;
                                      System.out.println("Invalid Marks. please re-enter");
                                      continue;
                                    }
                                    if(marks3[i]>17){
                                      atktCounter--;
                                      thirdSemAtkt[i] = false;
                                    }
                                }
                                else{
                                    if(marks3[i]<0 || marks3[i]>25){
                                        i--;
                                        System.out.println("Invalid Marks. please re-enter");
                                        continue;
                                    }
                                    if(marks3[i]>8){
                                      atktCounter--;
                                      thirdSemAtkt[i] = false;
                                    }
                                }
                              }
                              }    
                              // Re-exam for 4th sem atkt
                              for(int i=0; i<fourthSemAtkt.length; i++){
                              if(fourthSemAtkt[i]){
                                System.out.println("Enter The Marks of "+semFourthSubject[i]);
                                marks4[i] = sc.nextInt();
                                if(i<6){
                                    if(marks4[i]<0 || marks4[i]>50){
                                      i--;
                                      System.out.println("Invalid Marks. please re-enter");
                                      continue;
                                    }
                                    if(marks4[i]>17){
                                      atktCounter--;
                                      fourthSemAtkt[i] = false;
                                    }
                                }
                                else{
                                    if(marks4[i]<0 || marks4[i]>25){
                                        i--;
                                        System.out.println("Invalid Marks. please re-enter");
                                        continue;
                                    }
                                    if(marks4[i]>8){
                                      atktCounter--;
                                      fourthSemAtkt[i] = false;
                                    }
                                }
                              }
                              }
                              // Re-exam for 5h sem atkt
                              for(int i=0; i<fivthSemAtkt.length; i++){
                                if(fivthSemAtkt[i]){
                                  System.out.println("Enter The Marks of "+semFivthSubject[i]);
                                  marks5[i] = sc.nextInt();
                                  if(i<6){
                                    if(marks5[i]<0 || marks5[i]>50){
                                        i--;
                                        System.out.println("Invalid Marks. please re-enter");
                                        continue;
                                    }
                                    if(marks5[i]>17){
                                        atktCounter--;
                                        fivthSemAtkt[i] = false;
                                    }
                                  }
                                  else{
                                      if(marks5[i]<0 || marks5[i]>25){
                                        i--;
                                        System.out.println("Invalid Marks. please re-enter");
                                        continue;
                                      }
                                      if(marks5[i]>8){
                                        atktCounter--;
                                        fivthSemAtkt[i] = false;
                                      }
                                  }
                                }
                              }
                              // Exam for 6th semester

                              for(int i=0; i<6; i++){
                                System.out.println("Enter Marks Of "+semSixthSubject[i]);
                                marks6[i] = sc.nextInt();
                                if(marks6[i] < 0 || marks6[i]>50){
                                  i--;
                                  System.out.println("Invalid Marks. please re-enter");
                                  continue;
                                }
                                if(marks6[i]<17){
                                  atktCounter++;
                                  sixthSemAtkt[i] = true;
                                }
                              }
                              for(int i=6; i<8; i++){
                                  System.out.println("Enter Marks of "+semSixthSubject[i]);
                                  marks6[i] = sc.nextInt();
                                  if(marks6[i]<0 || marks6[i]>25){
                                    i--;
                                    System.out.println("Invalid Marks. please re-enter");
                                    continue;
                                  }
                                  if(marks6[i]<8){
                                    atktCounter++;
                                    sixthSemAtkt[i] = true;
                                  }
                              } 
                              System.out.println("After 6th Semester Exam : "+atktCounter);                  
                              if(atktCounter >=3){
                                thirdYearLoopCouter = true;
                                System.out.println("You have 3rd year back");
                                atktCounter = 0;
                              }
                              else{
                                do{
                                  //----------------------------------------------------
                                  // Re- exam for 1 sem atkt
                                    for(int i=0; i<firstSemAtkt.length; i++){
                                          if(firstSemAtkt[i]){
                                              System.out.println("Enter The Marks of "+semFirstSubject[i]);
                                              marks1[i] = sc.nextInt();
                                              if(i<6){
                                                if(marks1[i]<0 || marks1[i]>50){
                                                  i--;
                                                  System.out.println("Invalid Marks. please re-enter");
                                                  continue;
                                                }
                                                if(marks1[i]>17){
                                                  atktCounter--;
                                                  firstSemAtkt[i] = false;
                                                }
                                              }
                                              else{
                                                  if(marks1[i]<0 || marks1[i]>25){
                                                    i--;
                                                    System.out.println("Invalid Marks. please re-enter");
                                                    continue;
                                                  }
                                                  if(marks1[i]>8){
                                                      atktCounter--;
                                                      firstSemAtkt[i] = false;
                                                  }
                                              }
                                          }
                                    }

                                  // Re-exam for 2 sem atkt
                                    for(int i=0; i<secondSemAtkt.length; i++){
                                        if(secondSemAtkt[i]){
                                          System.out.println("Enter The Marks of "+semSecondSubject[i]);
                                          marks2[i] = sc.nextInt();
                                          if(i<6){
                                              if(marks2[i]<0 || marks2[i]>50){
                                                i--;
                                                System.out.println("Invalid Marks. please re-enter");
                                                continue;
                                              }
                                              if(marks2[i]>17){
                                                atktCounter--;
                                                secondSemAtkt[i] = false;
                                              }
                                          }
                                          else{
                                              if(marks2[i]<0 || marks2[i]>25){
                                                  i--;
                                                  System.out.println("Invalid Marks. please re-enter");
                                                  continue;
                                              }
                                              if(marks2[i]>8){
                                                atktCounter--;
                                                secondSemAtkt[i] = false;
                                              }
                                          }
                                        }
                                    }

                                  // Re-exam for 3 sem atkt
                                    for(int i=0; i<thirdSemAtkt.length; i++){
                                        if(thirdSemAtkt[i]){
                                          System.out.println("Enter The Marks of "+semThirdSubject[i]);
                                          marks3[i] = sc.nextInt();
                                          if(i<6){
                                              if(marks3[i]<0 || marks3[i]>50){
                                                i--;
                                                System.out.println("Invalid Marks. please re-enter");
                                                continue;
                                              }
                                              if(marks3[i]>17){
                                                atktCounter--;
                                                thirdSemAtkt[i] = false;
                                              }
                                          }
                                          else{
                                              if(marks3[i]<0 || marks3[i]>25){
                                                  i--;
                                                  System.out.println("Invalid Marks. please re-enter");
                                                  continue;
                                              }
                                              if(marks3[i]>8){
                                                atktCounter--;
                                                thirdSemAtkt[i] = false;
                                              }
                                          }
                                        }
                                    }    
                                    // Re-exam for 4th sem atkt
                                    for(int i=0; i<fourthSemAtkt.length; i++){
                                          if(fourthSemAtkt[i]){
                                            System.out.println("Enter The Marks of "+semFourthSubject[i]);
                                            marks4[i] = sc.nextInt();
                                            if(i<6){
                                                if(marks4[i]<0 || marks4[i]>50){
                                                  i--;
                                                  System.out.println("Invalid Marks. please re-enter");
                                                  continue;
                                                }
                                                if(marks4[i]>17){
                                                  atktCounter--;
                                                  fourthSemAtkt[i] = false;
                                                }
                                            }
                                            else{
                                                if(marks4[i]<0 || marks4[i]>25){
                                                    i--;
                                                    System.out.println("Invalid Marks. please re-enter");
                                                    continue;
                                                }
                                                if(marks4[i]>8){
                                                  atktCounter--;
                                                  fourthSemAtkt[i] = false;
                                                }
                                            }
                                          }
                                    }
                                    // Re-exam for 5h sem atkt
                                    for(int i=0; i<fivthSemAtkt.length; i++){
                                          if(fivthSemAtkt[i]){
                                            System.out.println("Enter The Marks of "+semFivthSubject[i]);
                                            marks5[i] = sc.nextInt();
                                            if(i<6){
                                              if(marks5[i]<0 || marks5[i]>50){
                                                  i--;
                                                  System.out.println("Invalid Marks. please re-enter");
                                                  continue;
                                              }
                                              if(marks5[i]>17){
                                                  atktCounter--;
                                                  fivthSemAtkt[i] = false;
                                              }
                                            }
                                            else{
                                                if(marks5[i]<0 || marks5[i]>25){
                                                  i--;
                                                  System.out.println("Invalid Marks. please re-enter");
                                                  continue;
                                                }
                                                if(marks5[i]>8){
                                                  atktCounter--;
                                                  fivthSemAtkt[i] = false;
                                                }
                                            }
                                          }
                                    }
                                    for(int i=0; i<sixthSemAtkt.length; i++){
                                          if(sixthSemAtkt[i]){
                                            System.out.println("Enter The Marks of "+semSixthSubject[i]);
                                            marks6[i] = sc.nextInt();
                                            if(i<6){
                                              if(marks6[i]<0 || marks6[i]>50){
                                                  i--;
                                                  System.out.println("Invalid Marks. please re-enter");
                                                  continue;
                                              }
                                              if(marks6[i]>17){
                                                  atktCounter--;
                                                  sixthSemAtkt[i] = false;
                                              }
                                            }
                                            else{
                                                if(marks6[i]<0 || marks6[i]>25){
                                                  i--;
                                                  System.out.println("Invalid Marks. please re-enter");
                                                  continue;
                                                }
                                                if(marks6[i]>8){
                                                  atktCounter--;
                                                  sixthSemAtkt[i] = false;
                                                }
                                            }
                                          }
                                    }
                                    System.out.println("Only Atkt  : "+atktCounter);
                                  //----------------------------------------------------
                                }while(atktCounter>=0);
                                
                                System.out.println("You are Graduated...");
                                // Display All Six semester Marksheet
                                // Also Display Degree Certificate..
                              }
                            }
                          }while(thirdYearLoopCouter);
                            
                        }
                      }
                  }while(secondYearLoopCounter);
                  // End of 3 semester 
                } 
                 
       } // Closing of 1sem atkt wala else
     }while(loopCounter);       
  }
}
