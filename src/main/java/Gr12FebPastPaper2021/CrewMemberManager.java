/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr12FebPastPaper2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class CrewMemberManager {

    private CrewMember[] cArr = new CrewMember[80];
    private int size = 0;

    public CrewMemberManager() {
        String filePath = "data//crewmembers.txt";
        try {
            Scanner fileScanner = new Scanner(new File(filePath));
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");
                String fullname = linesc.next();
                int crewId = linesc.nextInt();
                String department = linesc.next();

                if (linesc.hasNext()) {
                    int rank = linesc.nextInt();
                    String date = linesc.next();
                    DateTimeFormatter fileDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dateLD = LocalDate.parse(date, fileDate);
                    cArr[size] = new Officer(fullname, crewId, department, rank, dateLD);
                    size++;
                }

                cArr[size] = new CrewMember(fullname, crewId, department);
                size++;

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrewMemberManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < size; i++) {
            out += cArr[i] + "\n";
        }
        return out;
    }

    public int findCrewMember(int crewId) {
        int pos = 0;
        for (int i = 0; i < size; i++) {
            if (cArr[i].getCrewID() == crewId) {
                pos = i;
            }
        }
        return pos;

    }

    public void processTestResults() {
        String filePath = "data//testResults.txt";
        try {
            Scanner filesc = new Scanner(new File(filePath));
            while (filesc.hasNext()) {
                String line = filesc.nextLine();
                Scanner linesc = new Scanner(line);
                int crewIdTxtFile = linesc.nextInt();
                int testResult = linesc.nextInt();
                int p = findCrewMember(crewIdTxtFile);
                CrewMember currentMember = cArr[p];

                if (currentMember instanceof Officer) {
                    int currentMembersRank = ((Officer) currentMember).getRank();
                    switch (currentMembersRank) {
                        case 1:
                            if (testResult >= 75 & testResult >= 79) {
                                ((Officer) currentMember).promote();
                                break;
                            }
                        case 2:
                            if (testResult >= 80 & testResult >= 84) {
                                ((Officer) currentMember).promote();
                                break;
                            }
                        case 3:
                            if (testResult >= 85 & testResult >= 89) {
                                ((Officer) currentMember).promote();
                                break;
                            }
                        case 4:
                            if (testResult >= 90 & testResult >= 100) {
                                ((Officer) currentMember).promote();
                                break;
                            }
                        case 5:
                            break;

                    }

                }//end of check and promotion of officer

                if (currentMember instanceof CrewMember) {
                    if (testResult >= 75) {
                        CrewMember officer = new Officer();
                        
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrewMemberManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
