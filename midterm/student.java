import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class student extends JFrame{
    JButton compute = new JButton();
    JButton clear = new JButton();
    JButton exits = new JButton();
    
    JLabel height = new JLabel();
    JLabel weight = new JLabel();
    JLabel BMI = new JLabel();
    JLabel feet = new JLabel();
    JLabel inches = new JLabel();
    JLabel pounds = new JLabel();
    
    JTextField heightText = new JTextField();
    JTextField heightInches = new JTextField();
    JTextField weightText =  new JTextField();
    JTextField BMIText = new JTextField();
    
    public student(){
        setTitle("BMI Calculator");
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                exitForm(e);
            }
        });
        
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();
        
        height.setText("Height: ");
        grid.gridx=0;
        grid.gridy=1;
        getContentPane().add(height, grid);
        
        feet.setText("feet");
        grid.gridx=2;
        grid.gridy=1;
        getContentPane().add(feet, grid);
        
        inches.setText("inches ");
        grid.gridx=4;
        grid.gridy=1;
        getContentPane().add(inches, grid);
        
        
        weight.setText("Weight: ");
        grid.gridx=0;
        grid.gridy=2;
        getContentPane().add(weight, grid);
        
        pounds.setText("pounds");
        grid.gridx=2;
        grid.gridy=2;
        getContentPane().add(pounds, grid);
        
        BMI.setText("BMI: ");
        grid.gridx=0;
        grid.gridy=3;
        getContentPane().add(BMI, grid);
        
        
        weightText.setText("           ");
        grid.gridx=1;
        grid.gridy=2;
        getContentPane().add(weightText, grid);
        
        heightText.setText("           ");
        grid.gridx=1;
        grid.gridy=1;
        getContentPane().add(heightText, grid);
        
        heightInches.setText("           ");
        grid.gridx=3;
        grid.gridy=1;
        getContentPane().add(heightInches, grid);
        
        BMIText.setText("           ");
        grid.gridx=1;
        grid.gridy=3;
        getContentPane().add(BMIText, grid);
        
        compute.setText("Compute BMI");
        grid.gridx=0;
        grid.gridy=4;
        getContentPane().add(compute, grid);
        
        compute.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                computeForm(e);
            }
        });
        
        clear.setText("Clear");
        grid.gridx=2;
        grid.gridy=4;
        getContentPane().add(clear, grid);
        
        exits.setText("Exit");
        grid.gridx=4;
        grid.gridy=4;
        getContentPane().add(exits, grid);
        
        // ayoko na sir
        
        pack();
    }
    private void computeForm(ActionEvent e){
        JFrame f;
        f = new JFrame();
        
        String heightOne = heightText.getText();
        String heightTwo = heightInches.getText();
        String weightsum = weightText.getText();
        
        Double weightUno = Double.parseDouble(weightsum);
        Double heightUno = Double.parseDouble(heightOne);
        Double heightDos = Double.parseDouble(heightTwo);
        
        JOptionPane.showMessageDialog(f,  (weightUno / (heightUno * heightDos)) *703);
        double results = (weightUno / (heightUno * heightDos)) *703;
        String message = "" + results;
        BMIText.setText(message);
    }
        
    private void exitForm(WindowEvent e){
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "thank you!");
    }
    
    
    public static void main(String[] args){
        new student(). show();
    }
}