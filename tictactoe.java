
import java.security.SecureRandom;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author IZZAQI
 */
public class tictactoe extends javax.swing.JFrame {
    
    int turn;

    /**
     * Creates new form tictactoe
     */
    public tictactoe() {
        initComponents();
        button1.setText("");
        button1.setEnabled(true);
        button2.setText("");
        button2.setEnabled(true);
        button3.setText("");
        button3.setEnabled(true);
        button4.setText("");
        button4.setEnabled(true);
        button5.setText("");
        button5.setEnabled(true);
        button6.setText("");
        button6.setEnabled(true);
        button7.setText("");
        button7.setEnabled(true);
        button8.setText("");
        button8.setEnabled(true);
        button9.setText("");
        button9.setEnabled(true);
        pemenang.setText("");
        pemenang.setEnabled(false);
        firstTurn.setText("");
        firstTurn.setEnabled(false);
        milih.setText("");
        milih.setEnabled(false);
        
        turn = 1;
    }
    
    //untuk melihat hasil pertandignan
    void pemenang(){
        if(button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Player menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Komputer menang!");
            }
        }else if(button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Player menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Komputer menang!");
            }
        }else if(button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Player menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Komputer menang!");
            }
        }else if(button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Player menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Komputer menang!");
            }
        }else if(button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Player menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Komputer menang!");
            }
        }else if(button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Player menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Komputer menang!");
            }
        }else if(button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Player menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Komputer menang!");
            }
        }else if(button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Player menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Komputer menang!");
            }
        }else if(button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Komputer menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Player menang!");
            }
        }else if(button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Komputer menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Player menang!");
            }
        }else if(button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Komputer menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Player menang!");
            }
        }else if(button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Komputer menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Player menang!");
            }
        }else if(button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Komputer menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Player menang!");
            }
        }else if(button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Komputer menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Player menang!");
            }
        }else if(button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Komputer menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Player menang!");
            }
        }else if(button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")){
            if(firstTurn.getText().equals("Player")){
                pemenang.setText("Komputer menang!");
            }else if(firstTurn.getText().equals("Komputer")){
                pemenang.setText("Player menang!");
            }
        }else if((button1.getText() != "") && (button2.getText() != "") && (button3.getText() != "") && (button4.getText() != "") && 
                (button5.getText() != "") && (button6.getText() != "") && (button7.getText() != "") && (button8.getText() != "") && 
                (button9.getText() != "")){
                pemenang.setText("DRAW!");
        }
    }
    
    //unutk membuat komputer auto jalan
    void aiPlay(){
        if(firstTurn.getText().equals("Komputer")){
            SecureRandom rdm = new SecureRandom();
            int n;
            while(true){
                n = rdm.nextInt(9) + 1;
                if(n != 0) 
                break;
            }
            if(n == 1){
                if(button1.getText().equals("")){
                    if(turn == 1){
                    if(milih.getText().equals("X")){
                        button1.setText("O");
                    }else if(milih.getText().equals("O")){
                        button1.setText("X");
                    }
                    button1.setEnabled(false);
                    turn -= 1;
                    pemenang();
                    }else if(button1.getText().equals("")){
                    if(milih.getText().equals("X")){
                        button1.setText("X");
                    }else if(milih.getText().equals("O")){
                        button1.setText("O");
                    }
                    button1.setEnabled(false);
                    turn += 1;
                    pemenang();
                    }else{
                        aiPlay();
                    }
                }
            }else if(n == 2){
                if(turn == 1){
                    if(milih.getText().equals("X")){
                        button2.setText("O");
                    }else if(milih.getText().equals("O")){
                        button2.setText("X");
                    }
                    button2.setEnabled(false);
                    turn -= 1;
                    pemenang();
                    }else if(button2.getText().equals("")){
                    if(milih.getText().equals("X")){
                        button2.setText("X");
                    }else if(milih.getText().equals("O")){
                        button2.setText("O");
                    }
                    button2.setEnabled(false);
                    turn += 1;
                    pemenang();
                    }else{
                        aiPlay();
                    }
            }else if(n == 3){
                if(turn == 1){
                    if(milih.getText().equals("X")){
                        button3.setText("O");
                    }else if(milih.getText().equals("O")){
                        button3.setText("X");
                    }
                    button3.setEnabled(false);
                    turn -= 1;
                    pemenang();
                    }else if(button3.getText().equals("")){
                    if(milih.getText().equals("X")){
                        button3.setText("X");
                    }else if(milih.getText().equals("O")){
                        button3.setText("O");
                    }
                    button3.setEnabled(false);
                    turn += 1;
                    pemenang();
                    }else{
                        aiPlay();
                    }
            }else if(n == 4){
                if(turn == 1){
                    if(milih.getText().equals("X")){
                        button4.setText("O");
                    }else if(milih.getText().equals("O")){
                        button4.setText("X");
                    }
                    button4.setEnabled(false);
                    turn -= 1;
                    pemenang();
                    }else if(button4.getText().equals("")){
                    if(milih.getText().equals("X")){
                        button4.setText("X");
                    }else if(milih.getText().equals("O")){
                        button4.setText("O");
                    }
                    button4.setEnabled(false);
                    turn += 1;
                    pemenang();
                    }else{
                        aiPlay();
                    }
            }else if(n == 5){
                if(turn == 1){
                    if(milih.getText().equals("X")){
                        button5.setText("O");
                    }else if(milih.getText().equals("O")){
                        button5.setText("X");
                    }
                    button5.setEnabled(false);
                    turn -= 1;
                    pemenang();
                    }else if(button5.getText().equals("")){
                    if(milih.getText().equals("X")){
                        button5.setText("X");
                    }else if(milih.getText().equals("O")){
                        button5.setText("O");
                    }
                    button5.setEnabled(false);
                    turn += 1;
                    pemenang();
                    }else{
                        aiPlay();
                    }
            }else if(n == 6){
                if(turn == 1){
                    if(milih.getText().equals("X")){
                        button6.setText("O");
                    }else if(milih.getText().equals("O")){
                        button6.setText("X");
                    }
                    button6.setEnabled(false);
                    turn -= 1;
                    pemenang();
                    }else if(button6.getText().equals("")){
                    if(milih.getText().equals("X")){
                        button6.setText("X");
                    }else if(milih.getText().equals("O")){
                        button6.setText("O");
                    }
                    button6.setEnabled(false);
                    turn += 1;
                    pemenang();
                    }else{
                        aiPlay();
                    }
            }else if(n == 7){
                if(turn == 1){
                    if(milih.getText().equals("X")){
                        button7.setText("O");
                    }else if(milih.getText().equals("O")){
                        button7.setText("X");
                    }
                    button7.setEnabled(false);
                    turn -= 1;
                    pemenang();
                    }else if(button7.getText().equals("")){
                    if(milih.getText().equals("X")){
                        button7.setText("X");
                    }else if(milih.getText().equals("O")){
                        button7.setText("O");
                    }
                    button7.setEnabled(false);
                    turn += 1;
                    pemenang();
                    }else{
                        aiPlay();
                    }
            }else if(n == 8){
                if(turn == 1){
                    if(milih.getText().equals("X")){
                        button8.setText("O");
                    }else if(milih.getText().equals("O")){
                        button8.setText("X");
                    }
                    button8.setEnabled(false);
                    turn -= 1;
                    pemenang();
                    }else if(button8.getText().equals("")){
                    if(milih.getText().equals("X")){
                        button8.setText("X");
                    }else if(milih.getText().equals("O")){
                        button8.setText("O");
                    }
                    button8.setEnabled(false);
                    turn += 1;
                    pemenang();
                    }else{
                        aiPlay();
                    }
            }else if(n == 9){
                if(turn == 1){
                    if(milih.getText().equals("X")){
                        button9.setText("O");
                    }else if(milih.getText().equals("O")){
                        button9.setText("X");
                    }
                    button9.setEnabled(false);
                    turn -= 1;
                    pemenang();
                    }else if(button9.getText().equals("")){
                    if(milih.getText().equals("X")){
                        button9.setText("X");
                    }else if(milih.getText().equals("O")){
                        button9.setText("O");
                    }
                    button9.setEnabled(false);
                    turn += 1;
                    pemenang();
                    }else{
                        aiPlay();
                    }
                }
            }
    
}
    
    
    //apabila komputer mulai duluan
    void firstKom(){
        if(firstTurn.getText().equals("Komputer")){
            SecureRandom rdm = new SecureRandom();
            int n = rdm.nextInt(9) + 1;
            System.out.println(n);
            switch(n){
                case 1:
                        if(milih.getText().equals("X")){
                            button1.setText("X");
                        }else if(milih.getText().equals("O")){
                            button1.setText("O");
                        }
                        button1.setEnabled(false);
                        turn -= 1;
                    break;
                case 2:
                        if(milih.getText().equals("X")){
                           button2.setText("X");
                       }else if(milih.getText().equals("O")){
                           button2.setText("O");
                       }
                        button2.setEnabled(false);
                        turn -= 1;
                    break;
                case 3:
                        if(milih.getText().equals("X")){
                            button3.setText("X");
                        }else if(milih.getText().equals("O")){
                            button3.setText("O");
                        }
                         button3.setEnabled(false);
                         turn -= 1;
                case 4:
                        if(milih.getText().equals("X")){
                            button4.setText("X");
                        }else if(milih.getText().equals("O")){
                            button4.setText("O");
                        }
                         button4.setEnabled(false);
                         turn -= 1;
                    break;
                case 5:
                        if(milih.getText().equals("X")){
                            button5.setText("X");
                        }else if(milih.getText().equals("O")){
                            button5.setText("O");
                        }
                         button5.setEnabled(false);
                         turn -= 1;
                    break;
                case 6:
                        if(milih.getText().equals("X")){
                            button6.setText("X");
                        }else if(milih.getText().equals("O")){
                            button6.setText("O");
                        }
                         button6.setEnabled(false);
                         turn -= 1;
                    break;
                case 7:
                        if(milih.getText().equals("X")){
                            button7.setText("X");
                        }else if(milih.getText().equals("O")){
                            button7.setText("O");
                        }
                         button7.setEnabled(false);
                         turn -= 1;
                    break;
                case 8:
                        if(milih.getText().equals("X")){
                            button8.setText("X");
                        }else if(milih.getText().equals("O")){
                            button8.setText("O");
                        }
                         button8.setEnabled(false);
                         turn -= 1;
                    break;
                case 9:
                        if(milih.getText().equals("X")){
                            button9.setText("X");
                        }else if(milih.getText().equals("O")){
                            button9.setText("O");
                        }
                         button9.setEnabled(false);
                         turn -= 1;
                    break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player = new javax.swing.JButton();
        komputer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        oButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        milih = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        firstTurn = new javax.swing.JTextField();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        pemenang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        player.setText("Player");
        player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playerMouseClicked(evt);
            }
        });
        player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerActionPerformed(evt);
            }
        });

        komputer.setText("Komputer");
        komputer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                komputerMouseClicked(evt);
            }
        });
        komputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komputerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");

        reset.setText("Reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        xButton.setText("X");
        xButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xButtonMouseClicked(evt);
            }
        });
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });

        oButton.setText("O");
        oButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oButtonMouseClicked(evt);
            }
        });
        oButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Pertama:");

        milih.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        milih.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        milih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milihActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Sebagai:");

        firstTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstTurnActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        pemenang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pemenang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemenangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(milih, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(firstTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(xButton)
                                    .addComponent(player))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(komputer)
                                    .addComponent(oButton)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reset)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pemenang, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player)
                    .addComponent(komputer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xButton)
                    .addComponent(oButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(firstTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(milih, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pemenang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void firstTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstTurnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstTurnActionPerformed

    private void milihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_milihActionPerformed

    private void playerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerMouseClicked
        firstTurn.setText("Player");
    }//GEN-LAST:event_playerMouseClicked

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xButtonActionPerformed

    private void oButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oButtonActionPerformed

    private void playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerActionPerformed

    private void komputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komputerActionPerformed
        firstKom();
    }//GEN-LAST:event_komputerActionPerformed

    private void komputerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_komputerMouseClicked
        firstTurn.setText("Komputer");
    }//GEN-LAST:event_komputerMouseClicked

    private void xButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseClicked
        milih.setText("X");
        firstKom();
    }//GEN-LAST:event_xButtonMouseClicked

    private void oButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oButtonMouseClicked
        milih.setText("O");
        firstKom();
    }//GEN-LAST:event_oButtonMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        button1.setText("");
        button1.setEnabled(true);
        button2.setText("");
        button2.setEnabled(true);
        button3.setText("");
        button3.setEnabled(true);
        button4.setText("");
        button4.setEnabled(true);
        button5.setText("");
        button5.setEnabled(true);
        button6.setText("");
        button6.setEnabled(true);
        button7.setText("");
        button7.setEnabled(true);
        button8.setText("");
        button8.setEnabled(true);
        button9.setText("");
        button9.setEnabled(true);
        pemenang.setText("");
        pemenang.setEnabled(false);
        firstTurn.setText("");
        firstTurn.setEnabled(false);
        milih.setText("");
        milih.setEnabled(false);
        turn = 1;
    }//GEN-LAST:event_resetMouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       if(turn == 1){
            aiPlay();
            if(milih.getText().equals("X")){
            button1.setText("X");
            }else if(milih.getText().equals("O")){
                button1.setText("O");
            }
            button1.setEnabled(false);
            turn -= 1;
            pemenang();
       }else{
           aiPlay();
           if(milih.getText().equals("X")){
            button1.setText("O");
            }else if(milih.getText().equals("O")){
                button1.setText("X");
            }
            button1.setEnabled(false);
            turn += 1;
            pemenang();
       }
       
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        if(turn == 1){
            aiPlay();
            if(milih.getText().equals("X")){
               button2.setText("X");
           }else if(milih.getText().equals("O")){
               button2.setText("O");
           }
            button2.setEnabled(false);
            turn -= 1;
            pemenang();
        }else{
            aiPlay();
            if(milih.getText().equals("X")){
               button2.setText("O");
           }else if(milih.getText().equals("O")){
               button2.setText("X");
           }
            button2.setEnabled(false);
            turn += 1;
            pemenang();
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        if(turn == 1){
            aiPlay();
            if(milih.getText().equals("X")){
                button3.setText("X");
            }else if(milih.getText().equals("O")){
                button3.setText("O");
            }
             button3.setEnabled(false);
             turn -= 1;
             pemenang();
        }else{
            aiPlay();
            if(milih.getText().equals("X")){
                button3.setText("O");
            }else if(milih.getText().equals("O")){
                button3.setText("X");
            }
             button3.setEnabled(false);
             turn += 1;
             pemenang();
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void pemenangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemenangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemenangActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        if(turn == 1){
            aiPlay();
            if(milih.getText().equals("X")){
                button4.setText("X");
            }else if(milih.getText().equals("O")){
                button4.setText("O");
            }
             button4.setEnabled(false);
             turn -= 1;
             pemenang();
        }else{
            aiPlay();
            if(milih.getText().equals("X")){
                button4.setText("O");
            }else if(milih.getText().equals("O")){
                button4.setText("X");
            }
             button4.setEnabled(false);
             turn += 1;
             pemenang();
        }
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        if(turn == 1){
            aiPlay();
            if(milih.getText().equals("X")){
                button5.setText("X");
            }else if(milih.getText().equals("O")){
                button5.setText("O");
            }
             button5.setEnabled(false);
             turn -= 1;
             pemenang();
        }else{
            aiPlay();
            if(milih.getText().equals("X")){
                button5.setText("O");
            }else if(milih.getText().equals("O")){
                button5.setText("X");
            }
             button5.setEnabled(false);
             turn += 1;
             pemenang();
        }
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
       if(turn == 1){
           aiPlay();
            if(milih.getText().equals("X")){
                button6.setText("X");
            }else if(milih.getText().equals("O")){
                button6.setText("O");
            }
             button6.setEnabled(false);
             turn -= 1;
             pemenang();
        }else{
           aiPlay();
            if(milih.getText().equals("X")){
                button6.setText("O");
            }else if(milih.getText().equals("O")){
                button6.setText("X");
            }
             button6.setEnabled(false);
             turn += 1;
             pemenang();
        }
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        if(turn == 1){
            aiPlay();
            if(milih.getText().equals("X")){
                button7.setText("X");
            }else if(milih.getText().equals("O")){
                button7.setText("O");
            }
             button7.setEnabled(false);
             turn -= 1;
             pemenang();
        }else{
            aiPlay();
            if(milih.getText().equals("X")){
                button7.setText("O");
            }else if(milih.getText().equals("O")){
                button7.setText("X");
            }
             button7.setEnabled(false);
             turn += 1;
             pemenang();
        }
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        if(turn == 1){
            aiPlay();
            if(milih.getText().equals("X")){
                button8.setText("X");
            }else if(milih.getText().equals("O")){
                button8.setText("O");
            }
             button8.setEnabled(false);
             turn -= 1;
             pemenang();
        }else{
            aiPlay();
            if(milih.getText().equals("X")){
                button8.setText("O");
            }else if(milih.getText().equals("O")){
                button8.setText("X");
            }
             button8.setEnabled(false);
             turn += 1;
             pemenang();
        }
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        if(turn == 1){
            aiPlay();
            if(milih.getText().equals("X")){
                button9.setText("X");
            }else if(milih.getText().equals("O")){
                button9.setText("O");
            }
             button9.setEnabled(false);
             turn -= 1;
             pemenang();
        }else{
            aiPlay();
            if(milih.getText().equals("X")){
                button9.setText("O");
            }else if(milih.getText().equals("O")){
                button9.setText("X");
            }
             button9.setEnabled(false);
             turn += 1;
             pemenang();
        }
    }//GEN-LAST:event_button9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JTextField firstTurn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton komputer;
    private javax.swing.JTextField milih;
    private javax.swing.JButton oButton;
    private javax.swing.JButton pemenang;
    private javax.swing.JButton player;
    private javax.swing.JButton reset;
    private javax.swing.JButton xButton;
    // End of variables declaration//GEN-END:variables
}
