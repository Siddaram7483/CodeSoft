import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class WordsStatisticsGUI {
        private static JTextArea inputTextArea;
        private static JTextArea outputTextArea;

        public static void main(String[] args) {
            // Create and set up the GUI frame
            JFrame frame = new JFrame("Word Statistics");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.setSize(400, 300);

            // Create input and output text areas
            inputTextArea = new JTextArea();
            outputTextArea = new JTextArea();
            outputTextArea.setEditable(false);

            // Create a button for calculating word statistics
            JButton calculateButton = new JButton("Calculate Statistics");
            calculateButton.addActionListener(new CalculateButtonListener());

            // Create a panel to hold the button
            JPanel buttonPanel = new JPanel();
            buttonPanel.add(calculateButton);

            // Add the components to the frame
            frame.add(new JScrollPane(inputTextArea), BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);
            frame.add(new JScrollPane(outputTextArea), BorderLayout.EAST);

            // Display the GUI
            frame.setVisible(true);
        }

        private static class CalculateButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputTextArea.getText();
                // Check if the input text is not empty
                if (!inputText.trim().isEmpty()) {
                    // Split the input text into an array of words using spaces and punctuation as delimiters
                    String[] words = inputText.split("[\\s,.!?]+");

                    // Initialize a set of stop words (common words to ignore)
                    Set<String> stopWords = new HashSet<>(Arrays.asList("this", "is", "a", "and", "one", "yes", "it"));

                    // Initialize a map to store word frequencies
                    Map<String, Integer> wordFrequencyMap = new HashMap<>();

                    // Count the frequency of each word and ignore stop words
                    for (String word : words) {
                        String lowerCaseWord = word.toLowerCase();
                        if (!stopWords.contains(lowerCaseWord)) {
                            wordFrequencyMap.put(lowerCaseWord, wordFrequencyMap.getOrDefault(lowerCaseWord, 0) + 1);
                        }
                    }

                    // Display the word statistics in the output text area
                    StringBuilder statisticsText = new StringBuilder("Number of unique words: " + wordFrequencyMap.size() + "\n");
                    statisticsText.append("Word frequencies:\n");
                    for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
                        statisticsText.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
                    }
                    outputTextArea.setText(statisticsText.toString());
                } else {
                    // Display an error message if no valid input is provided
                    outputTextArea.setText("No valid input provided.");
                }
            }
        }
    }


