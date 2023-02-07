public class Bill extends javax.swing.JFrame{
    public Bill(){
        initComponents();
        billHeader();


    }

    private void billHeader(){

        txtbill.setText("==============" + "n"
        + "Company Name " + "n"
        + "Contact No-xxxxxxxxxx"+"n"
        + "Address - enter Address "+"n");

    }


    private void jBButton1ActionPerformed(java.awt.event.ActionEvent evt){
        try {
            txtbill.setText(txtbill.getText()+ "=================="+"n"+ "Developed by: Ivetion");

            txtbill.print();
        } catch (Exception e){

        }
    }
    }