package project1;


import javax.swing.*;

public class quiz {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null,
                "🎯 WELCOME TO CASH SHOW 🎯\nEnter Player Name:");

        // ===== QUESTIONS =====
        String[][] questions = {
                {"Who is known as the Missile Man of India?", "Vikram Sarabhai", "Homi Bhabha", "A. P. J. Abdul Kalam", "C. V. Raman", "3"},
                {"What is the SI unit of electric current?", "Volt", "Ohm", "Ampere", "Watt", "3"},
                {"The famous book Discovery of India was written by?", "Mahatma Gandhi", "Jawaharlal Nehru", "B. R. Ambedkar", "Rabindranath Tagore", "2"},
                {"Which river is called the Sorrow of Bihar?", "Ganga", "Kosi", "Yamuna", "Son", "2"},
                {"Who is known as the Father of the Indian Constitution?", "Mahatma Gandhi", "Jawaharlal Nehru", "B. R. Ambedkar", "Rajendra Prasad", "3"},
                {"Which Indian city is known as the Silicon Valley of India?", "Hyderabad", "Pune", "Chennai", "Bengaluru", "4"},
                {"The term Blue Planet refers to which planet?", "Mars", "Earth", "Neptune", "Uranus", "2"},
                {"What is the national animal of India?", "Lion", "Elephant", "Tiger", "Leopard", "3"},
                {"Which is the longest river in the world?", "Amazon", "Ganga", "Nile", "Yangtze", "3"},
                {"In which year did India win its first Cricket World Cup?", "1975", "1979", "1983", "1987", "3"}
        };

        int[] rewards = {5000, 10000, 20000, 40000, 80000, 160000, 320000, 500000, 750000, 1000000};

        boolean audiencePoll = true;
        boolean fiftyFifty = true;
        int totalWon = 0;

        // ===== QUIZ LOOP =====
        for (int i = 0; i < 10; i++) {

            StringBuilder qText = new StringBuilder();
            qText.append("Question ").append(i + 1).append(" for Rs.")
                 .append(rewards[i]).append("\n\n");
            qText.append(questions[i][0]).append("\n\n");
            qText.append("1. ").append(questions[i][1]).append("\n");
            qText.append("2. ").append(questions[i][2]).append("\n");
            qText.append("3. ").append(questions[i][3]).append("\n");
            qText.append("4. ").append(questions[i][4]).append("\n");
            qText.append("5. Lifeline");

            String input = JOptionPane.showInputDialog(null, qText.toString());
            if (input == null) break;

            int choice = Integer.parseInt(input);

            // ===== LIFELINE SECTION =====
            if (choice == 5) {

                if (i == 9) {
                    input = JOptionPane.showInputDialog(
                            "❌ Lifelines not allowed on 10th question!\nEnter your answer (1-4):");
                    choice = Integer.parseInt(input);
                }

                else if (!audiencePoll && !fiftyFifty) {
                    input = JOptionPane.showInputDialog(
                            "No lifelines available.\nEnter your answer (1-4):");
                    choice = Integer.parseInt(input);
                }

                else {

                    StringBuilder lifeText = new StringBuilder("Available Lifelines:\n");
                    if (audiencePoll) lifeText.append("1. Audience Poll\n");
                    if (fiftyFifty) lifeText.append("2. 50-50\n");

                    int life = Integer.parseInt(
                            JOptionPane.showInputDialog(lifeText.toString()));

                    // ===== Audience Poll =====
                    if (life == 1 && audiencePoll) {

                        audiencePoll = false;

                        int correctOption = Integer.parseInt(questions[i][5]);
                        int[] poll = new int[4];

                        int remaining = 100;

                        // Correct answer gets 40% to 60%
                        poll[correctOption - 1] =
                                40 + (int)(Math.random() * 21);
                        remaining -= poll[correctOption - 1];

                        // Distribute remaining %
                        for (int j = 0; j < 4; j++) {
                            if (j != correctOption - 1) {
                                if (j == 3) {
                                    poll[j] = remaining;
                                } else {
                                    poll[j] = (int)(Math.random() * remaining);
                                    remaining -= poll[j];
                                }
                            }
                        }

                        JOptionPane.showMessageDialog(null,
                                "📊 Audience Poll Result:\n\n" +
                                "1: " + poll[0] + "%\n" +
                                "2: " + poll[1] + "%\n" +
                                "3: " + poll[2] + "%\n" +
                                "4: " + poll[3] + "%");

                        choice = Integer.parseInt(
                                JOptionPane.showInputDialog("Enter your answer (1-4):"));
                    }

                    // ===== 50-50 Lifeline =====
                    else if (life == 2 && fiftyFifty) {

                        fiftyFifty = false;

                        int correctOption =
                                Integer.parseInt(questions[i][5]);

                        int wrongOption;

                        // pick a random wrong option
                        do {
                            wrongOption = 1 + (int)(Math.random() * 4);
                        } while (wrongOption == correctOption);

                        JOptionPane.showMessageDialog(null,
                                "🎯 50-50 Lifeline Used\n\n" +
                                correctOption + ". " + questions[i][correctOption] + "\n" +
                                wrongOption + ". " + questions[i][wrongOption]);

                        choice = Integer.parseInt(
                                JOptionPane.showInputDialog("Choose the correct option:"));
                    }

                    else {
                        choice = Integer.parseInt(
                                JOptionPane.showInputDialog("Invalid Lifeline! Enter answer (1-4):"));
                    }
                }
            }

            // ===== ANSWER CHECK =====
            if (choice == Integer.parseInt(questions[i][5])) {

                totalWon += rewards[i];

                JOptionPane.showMessageDialog(null,
                        "🥳 Congratulations " + name +
                                "\nYou have won Rs." + rewards[i] +
                                "\nTotal Won: Rs." + totalWon);
            }

            else {
                JOptionPane.showMessageDialog(null,
                        "❌ Wrong Answer! Game Over " + name +
                                "\nTotal Won: Rs." + totalWon);
                break;
            }
        }

        JOptionPane.showMessageDialog(null,
                "🎉 Thank you for playing, " + name + "!");
    }
}
