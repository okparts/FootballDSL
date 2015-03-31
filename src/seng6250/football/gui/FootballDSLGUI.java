/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seng6250.football.gui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import seng6250.football.misc.*;
import seng6250.football.models.DefensivePlaybook;
import seng6250.football.models.OffensivePlaybook;
import seng6250.football.parser.FootballDSLObjectifier;
import seng6250.football.parser.OutcomeGenerator;

/**
 *
 * @author Matt
 */
public class FootballDSLGUI extends javax.swing.JFrame {

    /**
     * Creates new form FootballDSLGUI
     */
    public FootballDSLGUI() {
        initComponents();
        initDSL();
    }

    private void initDSL() {
        // initialize Offense
        playbookCount++;
        offPlaybook.setText("Offensive Playbook " + Integer.toString(playbookCount));
        offPlay.setText("Offensive Play " + Integer.toString(playCount));
        offFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/poweri.PNG")));
        offFormImageLabel.setText("Power I Formation");
        offPosition1.setText("LeftTightEnd");
        offPosition2.setText("LeftTackle");
        offPosition3.setText("LeftGuard");
        offPosition4.setText("Center");
        offPosition5.setText("RightGuard");
        offPosition6.setText("RightTackle");
        offPosition7.setText("RightTightEnd");
        offPosition8.setText("Quarterback");
        offPosition9.setText("Fullback1");
        offPosition10.setText("Fullback2");
        offPosition11.setText("Halfback");
        offReset();
        
        // initialize Defense
        defPlaybook.setText("Defensive Playbook " + Integer.toString(playbookCount));
        defPlay.setText("Defensive Play " + Integer.toString(playCount));
        defFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/fourthree.png")));
        defFormImageLabel.setText("4-3 Formation");
        defPosition1.setText("LeftDefensiveEnd");
        defPosition2.setText("LeftDefensiveTackle");
        defPosition3.setText("RightDefensiveTackle");
        defPosition4.setText("RightDefensiveEnd");
        defPosition5.setText("LeftOutsideLinebacker");
        defPosition6.setText("MiddleLinebacker");
        defPosition7.setText("RightOutsideLinebacker");
        defPosition8.setText("LeftCornerback");
        defPosition9.setText("RightCornerback");
        defPosition10.setText("StrongSafety");
        defPosition11.setText("FreeSafety");
        defReset();
    }
    
    public void offReset() {
        // reset offense player attribute values
        offAgility1.setText("60");
        offAgility2.setText("60");
        offAgility3.setText("60");
        offAgility4.setText("60");
        offAgility5.setText("60");
        offAgility6.setText("60");
        offAgility7.setText("60");
        offAgility8.setText("60");
        offAgility9.setText("60");
        offAgility10.setText("60");
        offAgility11.setText("60");
        offBlocking1.setText("60");
        offBlocking2.setText("60");
        offBlocking3.setText("60");
        offBlocking4.setText("60");
        offBlocking5.setText("60");
        offBlocking6.setText("60");
        offBlocking7.setText("60");
        offBlocking8.setText("60");
        offBlocking9.setText("60");
        offBlocking10.setText("60");
        offBlocking11.setText("60");
        offCatching1.setText("60");
        offCatching2.setText("60");
        offCatching3.setText("60");
        offCatching4.setText("60");
        offCatching5.setText("60");
        offCatching6.setText("60");
        offCatching7.setText("60");
        offCatching8.setText("60");
        offCatching9.setText("60");
        offCatching10.setText("60");
        offCatching11.setText("60");
        offPower1.setText("60");
        offPower2.setText("60");
        offPower3.setText("60");
        offPower4.setText("60");
        offPower5.setText("60");
        offPower6.setText("60");
        offPower7.setText("60");
        offPower8.setText("60");
        offPower9.setText("60");
        offPower10.setText("60");
        offPower11.setText("60");
        offSmarts1.setText("60");
        offSmarts2.setText("60");
        offSmarts3.setText("60");
        offSmarts4.setText("60");
        offSmarts5.setText("60");
        offSmarts6.setText("60");
        offSmarts7.setText("60");
        offSmarts8.setText("60");
        offSmarts9.setText("60");
        offSmarts10.setText("60");
        offSmarts11.setText("60");
        offSpeed1.setText("60");
        offSpeed2.setText("60");
        offSpeed3.setText("60");
        offSpeed4.setText("60");
        offSpeed5.setText("60");
        offSpeed6.setText("60");
        offSpeed7.setText("60");
        offSpeed8.setText("60");
        offSpeed9.setText("60");
        offSpeed10.setText("60");
        offSpeed11.setText("60");
        offTackling1.setText("60");
        offTackling2.setText("60");
        offTackling3.setText("60");
        offTackling4.setText("60");
        offTackling5.setText("60");
        offTackling6.setText("60");
        offTackling7.setText("60");
        offTackling8.setText("60");
        offTackling9.setText("60");
        offTackling10.setText("60");
        offTackling11.setText("60");
        offThrowing1.setText("60");
        offThrowing2.setText("60");
        offThrowing3.setText("60");
        offThrowing4.setText("60");
        offThrowing5.setText("60");
        offThrowing6.setText("60");
        offThrowing7.setText("60");
        offThrowing8.setText("60");
        offThrowing9.setText("60");
        offThrowing10.setText("60");
        offThrowing11.setText("60");
    }
    
    public void defReset() {
        // reset defense player attribute values
        defAgility1.setText("60");
        defAgility2.setText("60");
        defAgility3.setText("60");
        defAgility4.setText("60");
        defAgility5.setText("60");
        defAgility6.setText("60");
        defAgility7.setText("60");
        defAgility8.setText("60");
        defAgility9.setText("60");
        defAgility10.setText("60");
        defAgility11.setText("60");
        defBlocking1.setText("60");
        defBlocking2.setText("60");
        defBlocking3.setText("60");
        defBlocking4.setText("60");
        defBlocking5.setText("60");
        defBlocking6.setText("60");
        defBlocking7.setText("60");
        defBlocking8.setText("60");
        defBlocking9.setText("60");
        defBlocking10.setText("60");
        defBlocking11.setText("60");
        defCatching1.setText("60");
        defCatching2.setText("60");
        defCatching3.setText("60");
        defCatching4.setText("60");
        defCatching5.setText("60");
        defCatching6.setText("60");
        defCatching7.setText("60");
        defCatching8.setText("60");
        defCatching9.setText("60");
        defCatching10.setText("60");
        defCatching11.setText("60");
        defPower1.setText("60");
        defPower2.setText("60");
        defPower3.setText("60");
        defPower4.setText("60");
        defPower5.setText("60");
        defPower6.setText("60");
        defPower7.setText("60");
        defPower8.setText("60");
        defPower9.setText("60");
        defPower10.setText("60");
        defPower11.setText("60");
        defSmarts1.setText("60");
        defSmarts2.setText("60");
        defSmarts3.setText("60");
        defSmarts4.setText("60");
        defSmarts5.setText("60");
        defSmarts6.setText("60");
        defSmarts7.setText("60");
        defSmarts8.setText("60");
        defSmarts9.setText("60");
        defSmarts10.setText("60");
        defSmarts11.setText("60");
        defSpeed1.setText("60");
        defSpeed2.setText("60");
        defSpeed3.setText("60");
        defSpeed4.setText("60");
        defSpeed5.setText("60");
        defSpeed6.setText("60");
        defSpeed7.setText("60");
        defSpeed8.setText("60");
        defSpeed9.setText("60");
        defSpeed10.setText("60");
        defSpeed11.setText("60");
        defTackling1.setText("60");
        defTackling2.setText("60");
        defTackling3.setText("60");
        defTackling4.setText("60");
        defTackling5.setText("60");
        defTackling6.setText("60");
        defTackling7.setText("60");
        defTackling8.setText("60");
        defTackling9.setText("60");
        defTackling10.setText("60");
        defTackling11.setText("60");
        defThrowing1.setText("60");
        defThrowing2.setText("60");
        defThrowing3.setText("60");
        defThrowing4.setText("60");
        defThrowing5.setText("60");
        defThrowing6.setText("60");
        defThrowing7.setText("60");
        defThrowing8.setText("60");
        defThrowing9.setText("60");
        defThrowing10.setText("60");
        defThrowing11.setText("60");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabsContainer = new javax.swing.JTabbedPane();
        offTab = new javax.swing.JPanel();
        offMainLabel = new javax.swing.JLabel();
        offPlaybookLabel = new javax.swing.JLabel();
        offPlayLabel = new javax.swing.JLabel();
        offPlaybook = new javax.swing.JTextField();
        offPlay = new javax.swing.JTextField();
        offFormLabel = new javax.swing.JLabel();
        offForm = new javax.swing.JComboBox();
        offPlayTypeLabel = new javax.swing.JLabel();
        offPlayType = new javax.swing.JComboBox();
        offPlayFocusLabel = new javax.swing.JLabel();
        offPlayFocus = new javax.swing.JComboBox();
        offFormImageContainer = new javax.swing.JPanel();
        offFormImage = new javax.swing.JLabel();
        offFormImageLabel = new javax.swing.JLabel();
        skillContainer = new javax.swing.JPanel();
        offPositionHdr = new javax.swing.JLabel();
        offAgilityHdr = new javax.swing.JLabel();
        offBlockingHdr = new javax.swing.JLabel();
        offCatchingHdr = new javax.swing.JLabel();
        offPowerHdr = new javax.swing.JLabel();
        offSmartsHdr = new javax.swing.JLabel();
        offSpeedHdr = new javax.swing.JLabel();
        offTacklingHdr = new javax.swing.JLabel();
        offThrowingHdr = new javax.swing.JLabel();
        offPosition1 = new javax.swing.JLabel();
        offPosition2 = new javax.swing.JLabel();
        offPosition3 = new javax.swing.JLabel();
        offPosition4 = new javax.swing.JLabel();
        offPosition5 = new javax.swing.JLabel();
        offPosition6 = new javax.swing.JLabel();
        offPosition7 = new javax.swing.JLabel();
        offPosition8 = new javax.swing.JLabel();
        offPosition9 = new javax.swing.JLabel();
        offPosition10 = new javax.swing.JLabel();
        offPosition11 = new javax.swing.JLabel();
        offSkillHorSep = new javax.swing.JSeparator();
        offAgility1 = new javax.swing.JTextField();
        offAgility2 = new javax.swing.JTextField();
        offAgility3 = new javax.swing.JTextField();
        offAgility4 = new javax.swing.JTextField();
        offAgility5 = new javax.swing.JTextField();
        offAgility6 = new javax.swing.JTextField();
        offAgility7 = new javax.swing.JTextField();
        offAgility8 = new javax.swing.JTextField();
        offAgility9 = new javax.swing.JTextField();
        offAgility10 = new javax.swing.JTextField();
        offAgility11 = new javax.swing.JTextField();
        offBlocking1 = new javax.swing.JTextField();
        offBlocking2 = new javax.swing.JTextField();
        offBlocking3 = new javax.swing.JTextField();
        offBlocking4 = new javax.swing.JTextField();
        offBlocking5 = new javax.swing.JTextField();
        offBlocking6 = new javax.swing.JTextField();
        offBlocking7 = new javax.swing.JTextField();
        offBlocking8 = new javax.swing.JTextField();
        offBlocking9 = new javax.swing.JTextField();
        offBlocking10 = new javax.swing.JTextField();
        offBlocking11 = new javax.swing.JTextField();
        offCatching1 = new javax.swing.JTextField();
        offCatching2 = new javax.swing.JTextField();
        offCatching3 = new javax.swing.JTextField();
        offCatching4 = new javax.swing.JTextField();
        offCatching5 = new javax.swing.JTextField();
        offCatching6 = new javax.swing.JTextField();
        offCatching7 = new javax.swing.JTextField();
        offCatching8 = new javax.swing.JTextField();
        offCatching9 = new javax.swing.JTextField();
        offCatching10 = new javax.swing.JTextField();
        offCatching11 = new javax.swing.JTextField();
        offPower1 = new javax.swing.JTextField();
        offPower2 = new javax.swing.JTextField();
        offPower3 = new javax.swing.JTextField();
        offPower4 = new javax.swing.JTextField();
        offPower5 = new javax.swing.JTextField();
        offPower6 = new javax.swing.JTextField();
        offPower7 = new javax.swing.JTextField();
        offPower8 = new javax.swing.JTextField();
        offPower9 = new javax.swing.JTextField();
        offPower10 = new javax.swing.JTextField();
        offPower11 = new javax.swing.JTextField();
        offSmarts1 = new javax.swing.JTextField();
        offSpeed1 = new javax.swing.JTextField();
        offTackling1 = new javax.swing.JTextField();
        offThrowing1 = new javax.swing.JTextField();
        offSmarts2 = new javax.swing.JTextField();
        offSpeed2 = new javax.swing.JTextField();
        offTackling2 = new javax.swing.JTextField();
        offThrowing2 = new javax.swing.JTextField();
        offSmarts3 = new javax.swing.JTextField();
        offSpeed3 = new javax.swing.JTextField();
        offTackling3 = new javax.swing.JTextField();
        offThrowing3 = new javax.swing.JTextField();
        offSmarts4 = new javax.swing.JTextField();
        offSpeed4 = new javax.swing.JTextField();
        offTackling4 = new javax.swing.JTextField();
        offThrowing4 = new javax.swing.JTextField();
        offSmarts5 = new javax.swing.JTextField();
        offSpeed5 = new javax.swing.JTextField();
        offTackling5 = new javax.swing.JTextField();
        offThrowing5 = new javax.swing.JTextField();
        offSmarts6 = new javax.swing.JTextField();
        offSpeed6 = new javax.swing.JTextField();
        offTackling6 = new javax.swing.JTextField();
        offThrowing6 = new javax.swing.JTextField();
        offSmarts7 = new javax.swing.JTextField();
        offSpeed7 = new javax.swing.JTextField();
        offTackling7 = new javax.swing.JTextField();
        offThrowing7 = new javax.swing.JTextField();
        offSmarts8 = new javax.swing.JTextField();
        offSpeed8 = new javax.swing.JTextField();
        offTackling8 = new javax.swing.JTextField();
        offThrowing8 = new javax.swing.JTextField();
        offSmarts9 = new javax.swing.JTextField();
        offSpeed9 = new javax.swing.JTextField();
        offTackling9 = new javax.swing.JTextField();
        offThrowing9 = new javax.swing.JTextField();
        offSmarts10 = new javax.swing.JTextField();
        offSpeed10 = new javax.swing.JTextField();
        offTackling10 = new javax.swing.JTextField();
        offThrowing10 = new javax.swing.JTextField();
        offSmarts11 = new javax.swing.JTextField();
        offSpeed11 = new javax.swing.JTextField();
        offTackling11 = new javax.swing.JTextField();
        offThrowing11 = new javax.swing.JTextField();
        offNewPlaybookBtn = new javax.swing.JButton();
        offResetBtn = new javax.swing.JButton();
        goToDefBtn = new javax.swing.JButton();
        generateBtn1 = new javax.swing.JButton();
        defTab = new javax.swing.JPanel();
        defMainLabel = new javax.swing.JLabel();
        defPlaybookLabel = new javax.swing.JLabel();
        defPlayLabel = new javax.swing.JLabel();
        defPlaybook = new javax.swing.JTextField();
        defPlay = new javax.swing.JTextField();
        defFormLabel = new javax.swing.JLabel();
        defForm = new javax.swing.JComboBox();
        defPlayTypeLabel = new javax.swing.JLabel();
        defPlayType = new javax.swing.JComboBox();
        deffPlayFocusLabel = new javax.swing.JLabel();
        defPlayFocus = new javax.swing.JComboBox();
        defFormImageContainer = new javax.swing.JPanel();
        defFormImage = new javax.swing.JLabel();
        defFormImageLabel = new javax.swing.JLabel();
        defSkillContainer = new javax.swing.JPanel();
        defPositionHdr = new javax.swing.JLabel();
        defAgilityHdr = new javax.swing.JLabel();
        defBlockingHdr = new javax.swing.JLabel();
        defCatchingHdr = new javax.swing.JLabel();
        defPowerHdr = new javax.swing.JLabel();
        defSmartsHdr = new javax.swing.JLabel();
        defSpeedHdr = new javax.swing.JLabel();
        defTacklingHdr = new javax.swing.JLabel();
        defThrowingHdr = new javax.swing.JLabel();
        defPosition1 = new javax.swing.JLabel();
        defPosition2 = new javax.swing.JLabel();
        defPosition3 = new javax.swing.JLabel();
        defPosition4 = new javax.swing.JLabel();
        defPosition5 = new javax.swing.JLabel();
        defPosition6 = new javax.swing.JLabel();
        defPosition7 = new javax.swing.JLabel();
        defPosition8 = new javax.swing.JLabel();
        defPosition9 = new javax.swing.JLabel();
        defPosition10 = new javax.swing.JLabel();
        defPosition11 = new javax.swing.JLabel();
        defSkillHorSep = new javax.swing.JSeparator();
        defAgility1 = new javax.swing.JTextField();
        defBlocking1 = new javax.swing.JTextField();
        defCatching1 = new javax.swing.JTextField();
        defPower1 = new javax.swing.JTextField();
        defSmarts1 = new javax.swing.JTextField();
        defSpeed1 = new javax.swing.JTextField();
        defTackling1 = new javax.swing.JTextField();
        defThrowing1 = new javax.swing.JTextField();
        defAgility2 = new javax.swing.JTextField();
        defBlocking2 = new javax.swing.JTextField();
        defCatching2 = new javax.swing.JTextField();
        defPower2 = new javax.swing.JTextField();
        defSmarts2 = new javax.swing.JTextField();
        defSpeed2 = new javax.swing.JTextField();
        defTackling2 = new javax.swing.JTextField();
        defThrowing2 = new javax.swing.JTextField();
        defAgility3 = new javax.swing.JTextField();
        defBlocking3 = new javax.swing.JTextField();
        defCatching3 = new javax.swing.JTextField();
        defPower3 = new javax.swing.JTextField();
        defSmarts3 = new javax.swing.JTextField();
        defSpeed3 = new javax.swing.JTextField();
        defTackling3 = new javax.swing.JTextField();
        defThrowing3 = new javax.swing.JTextField();
        defAgility4 = new javax.swing.JTextField();
        defBlocking4 = new javax.swing.JTextField();
        defCatching4 = new javax.swing.JTextField();
        defPower4 = new javax.swing.JTextField();
        defSmarts4 = new javax.swing.JTextField();
        defSpeed4 = new javax.swing.JTextField();
        defTackling4 = new javax.swing.JTextField();
        defThrowing4 = new javax.swing.JTextField();
        defAgility5 = new javax.swing.JTextField();
        defBlocking5 = new javax.swing.JTextField();
        defCatching5 = new javax.swing.JTextField();
        defPower5 = new javax.swing.JTextField();
        defSmarts5 = new javax.swing.JTextField();
        defSpeed5 = new javax.swing.JTextField();
        defTackling5 = new javax.swing.JTextField();
        defThrowing5 = new javax.swing.JTextField();
        defAgility6 = new javax.swing.JTextField();
        defBlocking6 = new javax.swing.JTextField();
        defCatching6 = new javax.swing.JTextField();
        defPower6 = new javax.swing.JTextField();
        defSmarts6 = new javax.swing.JTextField();
        defSpeed6 = new javax.swing.JTextField();
        defTackling6 = new javax.swing.JTextField();
        defThrowing6 = new javax.swing.JTextField();
        defAgility7 = new javax.swing.JTextField();
        defBlocking7 = new javax.swing.JTextField();
        defCatching7 = new javax.swing.JTextField();
        defPower7 = new javax.swing.JTextField();
        defSmarts7 = new javax.swing.JTextField();
        defSpeed7 = new javax.swing.JTextField();
        defTackling7 = new javax.swing.JTextField();
        defThrowing7 = new javax.swing.JTextField();
        defAgility8 = new javax.swing.JTextField();
        defBlocking8 = new javax.swing.JTextField();
        defCatching8 = new javax.swing.JTextField();
        defPower8 = new javax.swing.JTextField();
        defSmarts8 = new javax.swing.JTextField();
        defSpeed8 = new javax.swing.JTextField();
        defTackling8 = new javax.swing.JTextField();
        defThrowing8 = new javax.swing.JTextField();
        defAgility9 = new javax.swing.JTextField();
        defBlocking9 = new javax.swing.JTextField();
        defCatching9 = new javax.swing.JTextField();
        defPower9 = new javax.swing.JTextField();
        defSmarts9 = new javax.swing.JTextField();
        defSpeed9 = new javax.swing.JTextField();
        defTackling9 = new javax.swing.JTextField();
        defThrowing9 = new javax.swing.JTextField();
        defAgility10 = new javax.swing.JTextField();
        defBlocking10 = new javax.swing.JTextField();
        defCatching10 = new javax.swing.JTextField();
        defPower10 = new javax.swing.JTextField();
        defSmarts10 = new javax.swing.JTextField();
        defSpeed10 = new javax.swing.JTextField();
        defTackling10 = new javax.swing.JTextField();
        defThrowing10 = new javax.swing.JTextField();
        defAgility11 = new javax.swing.JTextField();
        defBlocking11 = new javax.swing.JTextField();
        defCatching11 = new javax.swing.JTextField();
        defPower11 = new javax.swing.JTextField();
        defSmarts11 = new javax.swing.JTextField();
        defSpeed11 = new javax.swing.JTextField();
        defTackling11 = new javax.swing.JTextField();
        defThrowing11 = new javax.swing.JTextField();
        defNewPlaybookBtn = new javax.swing.JButton();
        defResetBtn = new javax.swing.JButton();
        goToOffBtn = new javax.swing.JButton();
        generateBtn2 = new javax.swing.JButton();
        consoleTab = new javax.swing.JPanel();
        offDSLContainer = new javax.swing.JScrollPane();
        offDSLDisplay = new javax.swing.JTextArea();
        defDSLContainer = new javax.swing.JScrollPane();
        defDSLDisplay = new javax.swing.JTextArea();
        simContainer = new javax.swing.JScrollPane();
        simDisplay = new javax.swing.JTextArea();
        offObjContainer = new javax.swing.JScrollPane();
        offObjDisplay = new javax.swing.JTextArea();
        defObjContainer = new javax.swing.JScrollPane();
        defObjDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Football DSL - Play Builder");
        setResizable(false);

        offTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        offMainLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        offMainLabel.setText("Offensive Play Builder");

        offPlaybookLabel.setText("Offensive Playbook:");
        offPlaybookLabel.setToolTipText("");

        offPlayLabel.setText("Offensive Play:");
        offPlayLabel.setToolTipText("");

        offFormLabel.setText("Offensive Formation:");

        offForm.setModel(new DefaultComboBoxModel(OffensiveFormations.values()));
        offForm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                offFormItemStateChanged(evt);
            }
        });

        offPlayTypeLabel.setText("Offensive Play Type:");

        offPlayType.setModel(new DefaultComboBoxModel(OffensivePlayTypes.values()));

        offPlayFocusLabel.setText("Offensive Play Focus:");

        offPlayFocus.setModel(new DefaultComboBoxModel(PlayFocus.values()));

        offFormImageContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Play Formation Image"));

        offFormImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seng6250/football/images/poweri.PNG"))); // NOI18N

        offFormImageLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        offFormImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offFormImageLabel.setText("Power I Formation");

        javax.swing.GroupLayout offFormImageContainerLayout = new javax.swing.GroupLayout(offFormImageContainer);
        offFormImageContainer.setLayout(offFormImageContainerLayout);
        offFormImageContainerLayout.setHorizontalGroup(
            offFormImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offFormImageContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offFormImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(offFormImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(offFormImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        offFormImageContainerLayout.setVerticalGroup(
            offFormImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, offFormImageContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(offFormImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(offFormImage, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        skillContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Skill Information"));

        offPositionHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        offPositionHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPositionHdr.setText("Postition");

        offAgilityHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        offAgilityHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offAgilityHdr.setText("Agility");

        offBlockingHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        offBlockingHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offBlockingHdr.setText("Blocking");

        offCatchingHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        offCatchingHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offCatchingHdr.setText("Catching");

        offPowerHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        offPowerHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPowerHdr.setText("Power");

        offSmartsHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        offSmartsHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offSmartsHdr.setText("Smarts");

        offSpeedHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        offSpeedHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offSpeedHdr.setText("Speed");

        offTacklingHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        offTacklingHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offTacklingHdr.setText("Tackling");

        offThrowingHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        offThrowingHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offThrowingHdr.setText("Throwing");

        offPosition1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition1.setText("LeftTightEnd");

        offPosition2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition2.setText("LeftTackle");

        offPosition3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition3.setText("LeftGuard");

        offPosition4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition4.setText("Center");

        offPosition5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition5.setText("RightGuard");

        offPosition6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition6.setText("RightTackle");

        offPosition7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition7.setText("RightTightEnd");

        offPosition8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition8.setText("Quarterback");

        offPosition9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition9.setText("Fullback1");

        offPosition10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition10.setText("Fullback2");

        offPosition11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offPosition11.setText("Halfback");

        offAgility1.setColumns(2);
        offAgility1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility1.setText("60");

        offAgility2.setColumns(2);
        offAgility2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility2.setText("60");

        offAgility3.setColumns(2);
        offAgility3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility3.setText("60");

        offAgility4.setColumns(2);
        offAgility4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility4.setText("60");

        offAgility5.setColumns(2);
        offAgility5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility5.setText("60");

        offAgility6.setColumns(2);
        offAgility6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility6.setText("60");

        offAgility7.setColumns(2);
        offAgility7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility7.setText("60");

        offAgility8.setColumns(2);
        offAgility8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility8.setText("60");

        offAgility9.setColumns(2);
        offAgility9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility9.setText("60");

        offAgility10.setColumns(2);
        offAgility10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility10.setText("60");

        offAgility11.setColumns(2);
        offAgility11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offAgility11.setText("60");

        offBlocking1.setColumns(2);
        offBlocking1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking1.setText("60");

        offBlocking2.setColumns(2);
        offBlocking2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking2.setText("60");

        offBlocking3.setColumns(2);
        offBlocking3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking3.setText("60");

        offBlocking4.setColumns(2);
        offBlocking4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking4.setText("60");

        offBlocking5.setColumns(2);
        offBlocking5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking5.setText("60");

        offBlocking6.setColumns(2);
        offBlocking6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking6.setText("60");

        offBlocking7.setColumns(2);
        offBlocking7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking7.setText("60");

        offBlocking8.setColumns(2);
        offBlocking8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking8.setText("60");

        offBlocking9.setColumns(2);
        offBlocking9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking9.setText("60");

        offBlocking10.setColumns(2);
        offBlocking10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking10.setText("60");

        offBlocking11.setColumns(2);
        offBlocking11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offBlocking11.setText("60");

        offCatching1.setColumns(2);
        offCatching1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching1.setText("60");

        offCatching2.setColumns(2);
        offCatching2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching2.setText("60");

        offCatching3.setColumns(2);
        offCatching3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching3.setText("60");

        offCatching4.setColumns(2);
        offCatching4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching4.setText("60");

        offCatching5.setColumns(2);
        offCatching5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching5.setText("60");

        offCatching6.setColumns(2);
        offCatching6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching6.setText("60");

        offCatching7.setColumns(2);
        offCatching7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching7.setText("60");

        offCatching8.setColumns(2);
        offCatching8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching8.setText("60");

        offCatching9.setColumns(2);
        offCatching9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching9.setText("60");

        offCatching10.setColumns(2);
        offCatching10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching10.setText("60");

        offCatching11.setColumns(2);
        offCatching11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offCatching11.setText("60");

        offPower1.setColumns(2);
        offPower1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower1.setText("60");

        offPower2.setColumns(2);
        offPower2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower2.setText("60");

        offPower3.setColumns(2);
        offPower3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower3.setText("60");

        offPower4.setColumns(2);
        offPower4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower4.setText("60");

        offPower5.setColumns(2);
        offPower5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower5.setText("60");

        offPower6.setColumns(2);
        offPower6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower6.setText("60");

        offPower7.setColumns(2);
        offPower7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower7.setText("60");

        offPower8.setColumns(2);
        offPower8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower8.setText("60");

        offPower9.setColumns(2);
        offPower9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower9.setText("60");

        offPower10.setColumns(2);
        offPower10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower10.setText("60");

        offPower11.setColumns(2);
        offPower11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offPower11.setText("60");

        offSmarts1.setColumns(2);
        offSmarts1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts1.setText("60");

        offSpeed1.setColumns(2);
        offSpeed1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed1.setText("60");

        offTackling1.setColumns(2);
        offTackling1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling1.setText("60");

        offThrowing1.setColumns(2);
        offThrowing1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing1.setText("60");

        offSmarts2.setColumns(2);
        offSmarts2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts2.setText("60");

        offSpeed2.setColumns(2);
        offSpeed2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed2.setText("60");

        offTackling2.setColumns(2);
        offTackling2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling2.setText("60");

        offThrowing2.setColumns(2);
        offThrowing2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing2.setText("60");

        offSmarts3.setColumns(2);
        offSmarts3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts3.setText("60");

        offSpeed3.setColumns(2);
        offSpeed3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed3.setText("60");

        offTackling3.setColumns(2);
        offTackling3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling3.setText("60");

        offThrowing3.setColumns(2);
        offThrowing3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing3.setText("60");

        offSmarts4.setColumns(2);
        offSmarts4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts4.setText("60");

        offSpeed4.setColumns(2);
        offSpeed4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed4.setText("60");

        offTackling4.setColumns(2);
        offTackling4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling4.setText("60");

        offThrowing4.setColumns(2);
        offThrowing4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing4.setText("60");

        offSmarts5.setColumns(2);
        offSmarts5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts5.setText("60");

        offSpeed5.setColumns(2);
        offSpeed5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed5.setText("60");

        offTackling5.setColumns(2);
        offTackling5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling5.setText("60");

        offThrowing5.setColumns(2);
        offThrowing5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing5.setText("60");

        offSmarts6.setColumns(2);
        offSmarts6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts6.setText("60");

        offSpeed6.setColumns(2);
        offSpeed6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed6.setText("60");

        offTackling6.setColumns(2);
        offTackling6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling6.setText("60");

        offThrowing6.setColumns(2);
        offThrowing6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing6.setText("60");

        offSmarts7.setColumns(2);
        offSmarts7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts7.setText("60");

        offSpeed7.setColumns(2);
        offSpeed7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed7.setText("60");

        offTackling7.setColumns(2);
        offTackling7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling7.setText("60");

        offThrowing7.setColumns(2);
        offThrowing7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing7.setText("60");

        offSmarts8.setColumns(2);
        offSmarts8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts8.setText("60");

        offSpeed8.setColumns(2);
        offSpeed8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed8.setText("60");

        offTackling8.setColumns(2);
        offTackling8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling8.setText("60");

        offThrowing8.setColumns(2);
        offThrowing8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing8.setText("60");

        offSmarts9.setColumns(2);
        offSmarts9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts9.setText("60");

        offSpeed9.setColumns(2);
        offSpeed9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed9.setText("60");

        offTackling9.setColumns(2);
        offTackling9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling9.setText("60");

        offThrowing9.setColumns(2);
        offThrowing9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing9.setText("60");

        offSmarts10.setColumns(2);
        offSmarts10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts10.setText("60");

        offSpeed10.setColumns(2);
        offSpeed10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed10.setText("60");

        offTackling10.setColumns(2);
        offTackling10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling10.setText("60");

        offThrowing10.setColumns(2);
        offThrowing10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing10.setText("60");

        offSmarts11.setColumns(2);
        offSmarts11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSmarts11.setText("60");

        offSpeed11.setColumns(2);
        offSpeed11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offSpeed11.setText("60");

        offTackling11.setColumns(2);
        offTackling11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offTackling11.setText("60");

        offThrowing11.setColumns(2);
        offThrowing11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        offThrowing11.setText("60");

        javax.swing.GroupLayout skillContainerLayout = new javax.swing.GroupLayout(skillContainer);
        skillContainer.setLayout(skillContainerLayout);
        skillContainerLayout.setHorizontalGroup(
            skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skillContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createSequentialGroup()
                        .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(offPosition1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offPosition2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offPosition3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(offPosition4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offPosition5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offPosition6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offPosition7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offPosition8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offPosition9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offPosition10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offPosition11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offPositionHdr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(skillContainerLayout.createSequentialGroup()
                                .addComponent(offAgilityHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(offBlockingHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(offCatchingHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(offPowerHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(offSmartsHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(offSpeedHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(offTacklingHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(offThrowingHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(skillContainerLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(offBlocking11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(offBlocking10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(offBlocking9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(offBlocking8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(offBlocking7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(offBlocking6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(offBlocking5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(offBlocking4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(offBlocking3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(offBlocking2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offAgility1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(offBlocking1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(offCatching1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offCatching2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offCatching3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offCatching4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offCatching5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offCatching6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offCatching7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offCatching8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offCatching9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offCatching10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offCatching11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(offPower1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offPower2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offPower3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offPower4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offPower5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offPower6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offPower7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offPower8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offPower9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offPower10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offPower11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(skillContainerLayout.createSequentialGroup()
                                        .addComponent(offSmarts11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offSpeed11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(offTackling11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(offThrowing1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offThrowing2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offThrowing3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offThrowing4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offThrowing5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offThrowing6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offThrowing7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offThrowing8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offThrowing9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offThrowing10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offThrowing11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(offSkillHorSep))
                .addContainerGap())
        );
        skillContainerLayout.setVerticalGroup(
            skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skillContainerLayout.createSequentialGroup()
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(offPositionHdr)
                    .addComponent(offAgilityHdr)
                    .addComponent(offBlockingHdr)
                    .addComponent(offCatchingHdr)
                    .addComponent(offPowerHdr)
                    .addComponent(offSmartsHdr)
                    .addComponent(offSpeedHdr)
                    .addComponent(offTacklingHdr)
                    .addComponent(offThrowingHdr))
                .addGap(3, 3, 3)
                .addComponent(offSkillHorSep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(offPosition1)
                    .addComponent(offAgility1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offBlocking1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offCatching1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offPower1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offSmarts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offSpeed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offTackling1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offThrowing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offSmarts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offSpeed2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offTackling2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offThrowing2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offPosition2)
                        .addComponent(offAgility2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offBlocking2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offCatching2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offPower2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offSmarts3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offSpeed3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offTackling3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offThrowing3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offPosition3)
                        .addComponent(offAgility3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offBlocking3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offCatching3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offPower3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offSmarts4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offSpeed4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offTackling4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offThrowing4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offPosition4)
                        .addComponent(offAgility4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offBlocking4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offCatching4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offPower4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offSmarts5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offSpeed5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offTackling5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offThrowing5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offPosition5)
                        .addComponent(offAgility5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offBlocking5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offCatching5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offPower5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offSmarts6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offSpeed6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offTackling6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offThrowing6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offPosition6)
                        .addComponent(offAgility6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offBlocking6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offCatching6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offPower6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offSmarts7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offSpeed7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offTackling7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offThrowing7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offPosition7)
                        .addComponent(offAgility7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offBlocking7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offCatching7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offPower7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offSmarts8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offSpeed8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offTackling8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offThrowing8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offPosition8)
                        .addComponent(offAgility8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offBlocking8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offCatching8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offPower8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offSmarts9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offSpeed9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offTackling9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offThrowing9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offPosition9)
                        .addComponent(offAgility9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offBlocking9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offCatching9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offPower9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offSmarts10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offSpeed10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offTackling10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offThrowing10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offPosition10)
                        .addComponent(offAgility10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offBlocking10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offCatching10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offPower10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offSmarts11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offSpeed11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offTackling11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offThrowing11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offPosition11)
                        .addComponent(offAgility11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offBlocking11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offCatching11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(offPower11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        offNewPlaybookBtn.setText("New Playbook");
        offNewPlaybookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offNewPlaybookBtnActionPerformed(evt);
            }
        });

        offResetBtn.setText("Reset Offense");
        offResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offResetBtnActionPerformed(evt);
            }
        });

        goToDefBtn.setText("Setup Defense");
        goToDefBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToDefBtnActionPerformed(evt);
            }
        });

        generateBtn1.setText("Generate");
        generateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout offTabLayout = new javax.swing.GroupLayout(offTab);
        offTab.setLayout(offTabLayout);
        offTabLayout.setHorizontalGroup(
            offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offTabLayout.createSequentialGroup()
                .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(offTabLayout.createSequentialGroup()
                        .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(offTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(offMainLabel))
                            .addGroup(offTabLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(offPlaybookLabel)
                                    .addComponent(offPlayLabel)
                                    .addComponent(offFormLabel)
                                    .addComponent(offPlayTypeLabel)
                                    .addComponent(offPlayFocusLabel))
                                .addGap(18, 18, 18)
                                .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(offPlaybook)
                                    .addComponent(offPlay)
                                    .addComponent(offForm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(offPlayType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(offPlayFocus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(offFormImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(offNewPlaybookBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(goToDefBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generateBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(offTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(skillContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        offTabLayout.setVerticalGroup(
            offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offTabLayout.createSequentialGroup()
                .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(offFormImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(offTabLayout.createSequentialGroup()
                            .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(offTabLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(offMainLabel))
                                .addGroup(offTabLayout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(offPlaybookLabel)
                                        .addComponent(offPlaybook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(offPlayLabel)
                                        .addComponent(offPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(offForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(offFormLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(offPlayType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(offPlayTypeLabel))))
                            .addGroup(offTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(offTabLayout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(offPlayFocus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(offTabLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(offPlayFocusLabel)))))
                    .addGroup(offTabLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(offNewPlaybookBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offResetBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(goToDefBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(generateBtn1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skillContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsContainer.addTab("Offense", offTab);

        defTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        defMainLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        defMainLabel.setText("Defensive Play Builder");

        defPlaybookLabel.setText("Defensive Playbook:");
        defPlaybookLabel.setToolTipText("");

        defPlayLabel.setText("Defensive Play:");
        defPlayLabel.setToolTipText("");

        defFormLabel.setText("Defensive Formation:");

        defForm.setModel(new DefaultComboBoxModel(DefensiveFormations.values()));
        defForm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                defFormItemStateChanged(evt);
            }
        });

        defPlayTypeLabel.setText("Defensive Play Type:");

        defPlayType.setModel(new DefaultComboBoxModel(DefensivePlayTypes.values()));

        deffPlayFocusLabel.setText("Defensive Play Focus:");

        defPlayFocus.setModel(new DefaultComboBoxModel(PlayFocus.values()));

        defFormImageContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Play Formation Image"));

        defFormImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seng6250/football/images/fourthree.png"))); // NOI18N

        defFormImageLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        defFormImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defFormImageLabel.setText("4-3 Formation");

        javax.swing.GroupLayout defFormImageContainerLayout = new javax.swing.GroupLayout(defFormImageContainer);
        defFormImageContainer.setLayout(defFormImageContainerLayout);
        defFormImageContainerLayout.setHorizontalGroup(
            defFormImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defFormImageContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(defFormImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(defFormImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(defFormImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        defFormImageContainerLayout.setVerticalGroup(
            defFormImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defFormImageContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(defFormImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(defFormImage, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        defSkillContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Skill Information"));

        defPositionHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        defPositionHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPositionHdr.setText("Postition");

        defAgilityHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        defAgilityHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defAgilityHdr.setText("Agility");

        defBlockingHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        defBlockingHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defBlockingHdr.setText("Blocking");

        defCatchingHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        defCatchingHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defCatchingHdr.setText("Catching");

        defPowerHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        defPowerHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPowerHdr.setText("Power");

        defSmartsHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        defSmartsHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defSmartsHdr.setText("Smarts");

        defSpeedHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        defSpeedHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defSpeedHdr.setText("Speed");

        defTacklingHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        defTacklingHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defTacklingHdr.setText("Tackling");

        defThrowingHdr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        defThrowingHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defThrowingHdr.setText("Throwing");

        defPosition1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition1.setText("LeftDefensiveEnd");

        defPosition2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition2.setText("LeftDefensiveTackle");

        defPosition3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition3.setText("RightDefensiveTackle");

        defPosition4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition4.setText("RightDefensiveEnd");

        defPosition5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition5.setText("LeftOutsideLinebacker");

        defPosition6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition6.setText("MiddleLinebacker");

        defPosition7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition7.setText("RightOutsideLinebacker");

        defPosition8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition8.setText("LeftCornerback");

        defPosition9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition9.setText("RightCornerback");

        defPosition10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition10.setText("StrongSafety");

        defPosition11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defPosition11.setText("FreeSafety");

        defAgility1.setColumns(2);
        defAgility1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility1.setText("60");

        defBlocking1.setColumns(2);
        defBlocking1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking1.setText("60");

        defCatching1.setColumns(2);
        defCatching1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching1.setText("60");

        defPower1.setColumns(2);
        defPower1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower1.setText("60");

        defSmarts1.setColumns(2);
        defSmarts1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts1.setText("60");

        defSpeed1.setColumns(2);
        defSpeed1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed1.setText("60");

        defTackling1.setColumns(2);
        defTackling1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling1.setText("60");

        defThrowing1.setColumns(2);
        defThrowing1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing1.setText("60");

        defAgility2.setColumns(2);
        defAgility2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility2.setText("60");

        defBlocking2.setColumns(2);
        defBlocking2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking2.setText("60");

        defCatching2.setColumns(2);
        defCatching2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching2.setText("60");

        defPower2.setColumns(2);
        defPower2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower2.setText("60");

        defSmarts2.setColumns(2);
        defSmarts2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts2.setText("60");

        defSpeed2.setColumns(2);
        defSpeed2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed2.setText("60");

        defTackling2.setColumns(2);
        defTackling2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling2.setText("60");

        defThrowing2.setColumns(2);
        defThrowing2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing2.setText("60");

        defAgility3.setColumns(2);
        defAgility3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility3.setText("60");

        defBlocking3.setColumns(2);
        defBlocking3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking3.setText("60");

        defCatching3.setColumns(2);
        defCatching3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching3.setText("60");

        defPower3.setColumns(2);
        defPower3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower3.setText("60");

        defSmarts3.setColumns(2);
        defSmarts3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts3.setText("60");

        defSpeed3.setColumns(2);
        defSpeed3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed3.setText("60");

        defTackling3.setColumns(2);
        defTackling3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling3.setText("60");

        defThrowing3.setColumns(2);
        defThrowing3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing3.setText("60");

        defAgility4.setColumns(2);
        defAgility4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility4.setText("60");

        defBlocking4.setColumns(2);
        defBlocking4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking4.setText("60");

        defCatching4.setColumns(2);
        defCatching4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching4.setText("60");

        defPower4.setColumns(2);
        defPower4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower4.setText("60");

        defSmarts4.setColumns(2);
        defSmarts4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts4.setText("60");

        defSpeed4.setColumns(2);
        defSpeed4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed4.setText("60");

        defTackling4.setColumns(2);
        defTackling4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling4.setText("60");

        defThrowing4.setColumns(2);
        defThrowing4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing4.setText("60");

        defAgility5.setColumns(2);
        defAgility5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility5.setText("60");

        defBlocking5.setColumns(2);
        defBlocking5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking5.setText("60");

        defCatching5.setColumns(2);
        defCatching5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching5.setText("60");

        defPower5.setColumns(2);
        defPower5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower5.setText("60");

        defSmarts5.setColumns(2);
        defSmarts5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts5.setText("60");

        defSpeed5.setColumns(2);
        defSpeed5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed5.setText("60");

        defTackling5.setColumns(2);
        defTackling5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling5.setText("60");

        defThrowing5.setColumns(2);
        defThrowing5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing5.setText("60");

        defAgility6.setColumns(2);
        defAgility6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility6.setText("60");

        defBlocking6.setColumns(2);
        defBlocking6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking6.setText("60");

        defCatching6.setColumns(2);
        defCatching6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching6.setText("60");

        defPower6.setColumns(2);
        defPower6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower6.setText("60");

        defSmarts6.setColumns(2);
        defSmarts6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts6.setText("60");

        defSpeed6.setColumns(2);
        defSpeed6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed6.setText("60");

        defTackling6.setColumns(2);
        defTackling6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling6.setText("60");

        defThrowing6.setColumns(2);
        defThrowing6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing6.setText("60");

        defAgility7.setColumns(2);
        defAgility7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility7.setText("60");

        defBlocking7.setColumns(2);
        defBlocking7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking7.setText("60");

        defCatching7.setColumns(2);
        defCatching7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching7.setText("60");

        defPower7.setColumns(2);
        defPower7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower7.setText("60");

        defSmarts7.setColumns(2);
        defSmarts7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts7.setText("60");

        defSpeed7.setColumns(2);
        defSpeed7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed7.setText("60");

        defTackling7.setColumns(2);
        defTackling7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling7.setText("60");

        defThrowing7.setColumns(2);
        defThrowing7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing7.setText("60");

        defAgility8.setColumns(2);
        defAgility8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility8.setText("60");

        defBlocking8.setColumns(2);
        defBlocking8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking8.setText("60");

        defCatching8.setColumns(2);
        defCatching8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching8.setText("60");

        defPower8.setColumns(2);
        defPower8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower8.setText("60");

        defSmarts8.setColumns(2);
        defSmarts8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts8.setText("60");

        defSpeed8.setColumns(2);
        defSpeed8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed8.setText("60");

        defTackling8.setColumns(2);
        defTackling8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling8.setText("60");

        defThrowing8.setColumns(2);
        defThrowing8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing8.setText("60");

        defAgility9.setColumns(2);
        defAgility9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility9.setText("60");

        defBlocking9.setColumns(2);
        defBlocking9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking9.setText("60");

        defCatching9.setColumns(2);
        defCatching9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching9.setText("60");

        defPower9.setColumns(2);
        defPower9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower9.setText("60");

        defSmarts9.setColumns(2);
        defSmarts9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts9.setText("60");

        defSpeed9.setColumns(2);
        defSpeed9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed9.setText("60");

        defTackling9.setColumns(2);
        defTackling9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling9.setText("60");

        defThrowing9.setColumns(2);
        defThrowing9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing9.setText("60");

        defAgility10.setColumns(2);
        defAgility10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility10.setText("60");

        defBlocking10.setColumns(2);
        defBlocking10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking10.setText("60");

        defCatching10.setColumns(2);
        defCatching10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching10.setText("60");

        defPower10.setColumns(2);
        defPower10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower10.setText("60");

        defSmarts10.setColumns(2);
        defSmarts10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts10.setText("60");

        defSpeed10.setColumns(2);
        defSpeed10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed10.setText("60");

        defTackling10.setColumns(2);
        defTackling10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling10.setText("60");

        defThrowing10.setColumns(2);
        defThrowing10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing10.setText("60");

        defAgility11.setColumns(2);
        defAgility11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defAgility11.setText("60");

        defBlocking11.setColumns(2);
        defBlocking11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defBlocking11.setText("60");

        defCatching11.setColumns(2);
        defCatching11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defCatching11.setText("60");

        defPower11.setColumns(2);
        defPower11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defPower11.setText("60");

        defSmarts11.setColumns(2);
        defSmarts11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSmarts11.setText("60");

        defSpeed11.setColumns(2);
        defSpeed11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defSpeed11.setText("60");

        defTackling11.setColumns(2);
        defTackling11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defTackling11.setText("60");

        defThrowing11.setColumns(2);
        defThrowing11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        defThrowing11.setText("60");

        javax.swing.GroupLayout defSkillContainerLayout = new javax.swing.GroupLayout(defSkillContainer);
        defSkillContainer.setLayout(defSkillContainerLayout);
        defSkillContainerLayout.setHorizontalGroup(
            defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defSkillContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createSequentialGroup()
                        .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(defPosition1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defPosition2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defPosition3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(defPosition4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defPosition5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defPosition6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defPosition7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defPosition8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defPosition9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defPosition10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defPosition11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defPositionHdr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                .addComponent(defAgilityHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defBlockingHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defCatchingHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defPowerHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defSmartsHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defSpeedHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defTacklingHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defThrowingHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(defSkillContainerLayout.createSequentialGroup()
                                        .addComponent(defAgility11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(defBlocking11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(defCatching11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(defPower11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(defSmarts11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(defSpeed11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(defTackling11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(defThrowing11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defSkillContainerLayout.createSequentialGroup()
                                        .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                                .addComponent(defAgility1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(defBlocking1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defCatching1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(defPower1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(defSmarts1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defSpeed1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defTackling1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                                .addComponent(defAgility2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(defBlocking2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defCatching2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(defPower2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(defSmarts2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defSpeed2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defTackling2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                                .addComponent(defAgility3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(defBlocking3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defCatching3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(defPower3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(defSmarts3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defSpeed3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defTackling3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                                .addComponent(defAgility4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(defBlocking4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defCatching4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(defPower4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(defSmarts4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defSpeed4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defTackling4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                                .addComponent(defAgility5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(defBlocking5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defCatching5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(defPower5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(defSmarts5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defSpeed5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defTackling5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                                .addComponent(defAgility6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(defBlocking6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defCatching6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(defPower6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(defSmarts6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defSpeed6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defTackling6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                                .addComponent(defAgility7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(defBlocking7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defCatching7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(defPower7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(defSmarts7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defSpeed7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defTackling7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                                .addComponent(defAgility8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(defBlocking8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defCatching8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(defPower8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(defSmarts8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defSpeed8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defTackling8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(defSkillContainerLayout.createSequentialGroup()
                                                .addComponent(defAgility9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(defBlocking9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defCatching9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(defPower9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(defSmarts9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defSpeed9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(defTackling9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(defThrowing9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(defThrowing8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(defThrowing7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(defThrowing6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(defThrowing5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(defThrowing4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(defThrowing3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(defThrowing1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(defThrowing2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(defSkillContainerLayout.createSequentialGroup()
                                        .addComponent(defAgility10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(defBlocking10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(defCatching10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(defPower10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(defSmarts10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(defSpeed10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(defTackling10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(defThrowing10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(defSkillHorSep))
                .addContainerGap())
        );
        defSkillContainerLayout.setVerticalGroup(
            defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defSkillContainerLayout.createSequentialGroup()
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defPositionHdr)
                    .addComponent(defAgilityHdr)
                    .addComponent(defBlockingHdr)
                    .addComponent(defCatchingHdr)
                    .addComponent(defPowerHdr)
                    .addComponent(defSmartsHdr)
                    .addComponent(defSpeedHdr)
                    .addComponent(defTacklingHdr)
                    .addComponent(defThrowingHdr))
                .addGap(3, 3, 3)
                .addComponent(defSkillHorSep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defPosition1)
                    .addComponent(defAgility1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defBlocking1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defCatching1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defPower1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defSmarts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defSpeed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defTackling1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defThrowing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(defAgility2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defBlocking2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defCatching2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defPower2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSmarts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSpeed2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defTackling2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defThrowing2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defPosition2))
                .addGap(11, 11, 11)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(defAgility3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defBlocking3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defCatching3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defPower3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSmarts3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSpeed3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defTackling3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defThrowing3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defPosition3))
                .addGap(11, 11, 11)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(defAgility4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defBlocking4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defCatching4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defPower4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSmarts4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSpeed4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defTackling4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defThrowing4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defPosition4))
                .addGap(11, 11, 11)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(defAgility5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defBlocking5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defCatching5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defPower5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSmarts5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSpeed5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defTackling5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defThrowing5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defPosition5))
                .addGap(11, 11, 11)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(defAgility6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defBlocking6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defCatching6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defPower6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSmarts6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSpeed6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defTackling6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defThrowing6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defPosition6))
                .addGap(11, 11, 11)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(defAgility7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defBlocking7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defCatching7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defPower7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSmarts7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSpeed7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defTackling7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defThrowing7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defPosition7))
                .addGap(11, 11, 11)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(defAgility8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defBlocking8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defCatching8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defPower8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSmarts8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSpeed8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defTackling8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defThrowing8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defPosition8))
                .addGap(11, 11, 11)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(defAgility9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defBlocking9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defCatching9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defPower9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSmarts9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSpeed9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defTackling9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defThrowing9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defPosition9))
                .addGap(11, 11, 11)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(defAgility10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defBlocking10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defCatching10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defPower10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSmarts10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSpeed10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defTackling10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defThrowing10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defPosition10))
                .addGap(11, 11, 11)
                .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defSkillContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(defAgility11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defBlocking11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defCatching11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defPower11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSmarts11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defSpeed11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defTackling11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(defThrowing11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defPosition11))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        defNewPlaybookBtn.setText("New Playbook");
        defNewPlaybookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defNewPlaybookBtnActionPerformed(evt);
            }
        });

        defResetBtn.setText("Reset Defense");
        defResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defResetBtnActionPerformed(evt);
            }
        });

        goToOffBtn.setText("Setup Offense");
        goToOffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToOffBtnActionPerformed(evt);
            }
        });

        generateBtn2.setText("Generate");
        generateBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout defTabLayout = new javax.swing.GroupLayout(defTab);
        defTab.setLayout(defTabLayout);
        defTabLayout.setHorizontalGroup(
            defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defTabLayout.createSequentialGroup()
                .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defTabLayout.createSequentialGroup()
                        .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(defTabLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(defMainLabel))
                            .addGroup(defTabLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(defPlaybookLabel)
                                    .addComponent(defPlayLabel)
                                    .addComponent(defFormLabel)
                                    .addComponent(defPlayTypeLabel)
                                    .addComponent(deffPlayFocusLabel))
                                .addGap(18, 18, 18)
                                .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(defPlaybook)
                                    .addComponent(defPlay)
                                    .addComponent(defForm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(defPlayType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(defPlayFocus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(defFormImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(defNewPlaybookBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(goToOffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generateBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(defTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(defSkillContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        defTabLayout.setVerticalGroup(
            defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defTabLayout.createSequentialGroup()
                .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(defFormImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(defTabLayout.createSequentialGroup()
                            .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(defTabLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(defMainLabel))
                                .addGroup(defTabLayout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(defPlaybookLabel)
                                        .addComponent(defPlaybook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(defPlayLabel)
                                        .addComponent(defPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(defForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(defFormLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(defPlayType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(defPlayTypeLabel))))
                            .addGap(17, 17, 17)
                            .addGroup(defTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(defPlayFocus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deffPlayFocusLabel))))
                    .addGroup(defTabLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(defNewPlaybookBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(defResetBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(goToOffBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(generateBtn2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(defSkillContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsContainer.addTab("Defense", defTab);

        offDSLContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Offensive DSL Object Console"));

        offDSLDisplay.setColumns(20);
        offDSLDisplay.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        offDSLDisplay.setRows(5);
        offDSLDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        offDSLContainer.setViewportView(offDSLDisplay);

        defDSLContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Defensive DSL Object Console"));

        defDSLDisplay.setColumns(20);
        defDSLDisplay.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        defDSLDisplay.setRows(5);
        defDSLDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        defDSLContainer.setViewportView(defDSLDisplay);

        simContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Simulation Console"));

        simDisplay.setColumns(20);
        simDisplay.setRows(5);
        simDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        simContainer.setViewportView(simDisplay);

        offObjContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Offense Playbook Object Console"));

        offObjDisplay.setColumns(20);
        offObjDisplay.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        offObjDisplay.setRows(5);
        offObjDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        offObjContainer.setViewportView(offObjDisplay);

        defObjContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Offense Playbook Object Console"));

        defObjDisplay.setColumns(20);
        defObjDisplay.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        defObjDisplay.setRows(5);
        defObjDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        defObjContainer.setViewportView(defObjDisplay);

        javax.swing.GroupLayout consoleTabLayout = new javax.swing.GroupLayout(consoleTab);
        consoleTab.setLayout(consoleTabLayout);
        consoleTabLayout.setHorizontalGroup(
            consoleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consoleTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consoleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(simContainer)
                    .addGroup(consoleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consoleTabLayout.createSequentialGroup()
                            .addComponent(offDSLContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(defDSLContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(consoleTabLayout.createSequentialGroup()
                            .addComponent(offObjContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(defObjContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        consoleTabLayout.setVerticalGroup(
            consoleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consoleTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consoleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(offDSLContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(defDSLContainer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(simContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consoleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offObjContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(defObjContainer))
                .addContainerGap())
        );

        tabsContainer.addTab("Console", consoleTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsContainer, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void offFormItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_offFormItemStateChanged
        int index = offForm.getSelectedIndex();
        if (index == 0) {
            offFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/poweri.PNG")));
            offFormImageLabel.setText("Power I Formation");
            offPosition1.setText("LeftTightEnd");
            offPosition2.setText("LeftTackle");
            offPosition3.setText("LeftGuard");
            offPosition4.setText("Center");
            offPosition5.setText("RightGuard");
            offPosition6.setText("RightTackle");
            offPosition7.setText("RightTightEnd");
            offPosition8.setText("Quarterback");
            offPosition9.setText("Fullback1");
            offPosition10.setText("Fullback2");
            offPosition11.setText("Halfback");
        } else if (index == 1) {
            offFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/proset.PNG")));
            offFormImageLabel.setText("Proset Formation");
            offPosition1.setText("LeftTackle");
            offPosition2.setText("LeftGuard");
            offPosition3.setText("Center");
            offPosition4.setText("RightGuard");
            offPosition5.setText("RightTackle");
            offPosition6.setText("RightTightEnd");
            offPosition7.setText("Quarterback");
            offPosition8.setText("Halfback");
            offPosition9.setText("Fullback");
            offPosition10.setText("WideReceiver1");
            offPosition11.setText("WideReceiver2");
        } else if (index == 2) {
            offFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/offGoalline.png")));
            offFormImageLabel.setText("Goalline Formation");
            offPosition1.setText("LeftTightEnd1");
            offPosition2.setText("LeftTightEnd2");
            offPosition3.setText("LeftTackle");
            offPosition4.setText("LeftGuard");
            offPosition5.setText("Center");
            offPosition6.setText("RightGuard");
            offPosition7.setText("RightTackle");
            offPosition8.setText("RightTightEnd");
            offPosition9.setText("Quarterback");
            offPosition10.setText("Fullback");
            offPosition11.setText("Halfback");
        } else if (index == 3) {
            offFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/shotgun.PNG")));
            offFormImageLabel.setText("Shotgun Formation");
            offPosition1.setText("LeftTackle");
            offPosition2.setText("LeftGuard");
            offPosition3.setText("Center");
            offPosition4.setText("RightGuard");
            offPosition5.setText("RightTackle");
            offPosition6.setText("RightTightEnd");
            offPosition7.setText("Quarterback");
            offPosition8.setText("Halfback");
            offPosition9.setText("WideReceiver1");
            offPosition10.setText("WideReceiver2");
            offPosition11.setText("WideReceiver3");
        } else if (index == 4) {
            offFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/wishbone.PNG")));
            offFormImageLabel.setText("Wishbone Formation");
            offPosition1.setText("LeftTightEnd");
            offPosition2.setText("LeftTackle");
            offPosition3.setText("LeftGuard");
            offPosition4.setText("Center");
            offPosition5.setText("RightGuard");
            offPosition6.setText("RightTackle");
            offPosition7.setText("RightTightEnd");
            offPosition8.setText("Quarterback");
            offPosition9.setText("Fullback");
            offPosition10.setText("Halfback1");
            offPosition11.setText("Halfback2");
        }
    }//GEN-LAST:event_offFormItemStateChanged

    private void offResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offResetBtnActionPerformed
        // offense reset button action
        offReset();
        offPlaybook.setText("Offensive Playbook " + Integer.toString(playbookCount));
        offPlay.setText("Offensive Play " + Integer.toString(playCount));
        offForm.setSelectedIndex(0);
        offFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/poweri.PNG")));
        offFormImageLabel.setText("Power I Formation");
        offPosition1.setText("LeftTightEnd");
        offPosition2.setText("LeftTackle");
        offPosition3.setText("LeftGuard");
        offPosition4.setText("Center");
        offPosition5.setText("RightGuard");
        offPosition6.setText("RightTackle");
        offPosition7.setText("RightTightEnd");
        offPosition8.setText("Quarterback");
        offPosition9.setText("Fullback1");
        offPosition10.setText("Fullback2");
        offPosition11.setText("Halfback");
    }//GEN-LAST:event_offResetBtnActionPerformed

    private void offNewPlaybookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offNewPlaybookBtnActionPerformed
        playCount = 1;
        offForm.setSelectedIndex(0);
        initDSL();
    }//GEN-LAST:event_offNewPlaybookBtnActionPerformed

    private void goToDefBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToDefBtnActionPerformed
        tabsContainer.setSelectedIndex(1);
    }//GEN-LAST:event_goToDefBtnActionPerformed

    private void defFormItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_defFormItemStateChanged
        int index = defForm.getSelectedIndex();
        if (index == 0) {
            defFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/fourthree.png")));
            defFormImageLabel.setText("4-3 Formation");
            defPosition1.setText("LeftDefensiveEnd");
            defPosition2.setText("LeftDefensiveTackle");
            defPosition3.setText("RightDefensiveTackle");
            defPosition4.setText("RightDefensiveEnd");
            defPosition5.setText("LeftOutsideLinebacker");
            defPosition6.setText("MiddleLinebacker");
            defPosition7.setText("RightOutsideLinebacker");
            defPosition8.setText("LeftCornerback");
            defPosition9.setText("RightCornerback");
            defPosition10.setText("StrongSafety");
            defPosition11.setText("FreeSafety");
        } else if (index == 1) {
            defFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/fivetwo.png")));
            defFormImageLabel.setText("5-2 Formation");
            defPosition1.setText("LeftDefensiveEnd");
            defPosition2.setText("LeftDefensiveTackle");
            defPosition3.setText("NoseGuard");
            defPosition4.setText("RightDefensiveTackle");
            defPosition5.setText("RightDefensiveEnd");
            defPosition6.setText("MiddleLinebacker1");
            defPosition7.setText("MiddleLinebacker2");
            defPosition8.setText("LeftCornerback");
            defPosition9.setText("RightCornerback");
            defPosition10.setText("StrongSafety");
            defPosition11.setText("FreeSafety");
        } else if (index == 2) {
            defFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/threefour.png")));
            defFormImageLabel.setText("3-4 Formation");
            defPosition1.setText("LeftDefensiveEnd");
            defPosition2.setText("NoseGuard");
            defPosition3.setText("RightDefensiveEnd");
            defPosition4.setText("LeftOutsideLinebacker");
            defPosition5.setText("MiddleLinebacker1");
            defPosition6.setText("MiddleLinebacker2");
            defPosition7.setText("RightOutsideLinebacker");
            defPosition8.setText("LeftCornerback");
            defPosition9.setText("RightCornerback");
            defPosition10.setText("StrongSafety");
            defPosition11.setText("FreeSafety");
        } else if (index == 3) {
            defFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/prevent.PNG")));
            defFormImageLabel.setText("Prevent Formation");
            defPosition1.setText("LeftDefensiveEnd");
            defPosition2.setText("NoseGuard");
            defPosition3.setText("RightDefensiveEnd");
            defPosition4.setText("MiddleLinebacker");
            defPosition5.setText("LeftCornerback1");
            defPosition6.setText("LeftCornerback2");
            defPosition7.setText("RightCornerback1");
            defPosition8.setText("RightCornerback2");
            defPosition9.setText("StrongSafety1");
            defPosition10.setText("StrongSafety2");
            defPosition11.setText("FreeSafety");
        } else if (index == 4) {
            defFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/defGoalline.PNG")));
            defFormImageLabel.setText("Goalline Formation");
            defPosition1.setText("LeftDefensiveEnd");
            defPosition2.setText("LeftDefensiveTackle");
            defPosition3.setText("NoseGuard");
            defPosition4.setText("RightDefensiveTackle");
            defPosition5.setText("RightDefensiveEnd");
            defPosition6.setText("MiddleLinebacker1");
            defPosition7.setText("MiddleLinebacker2");
            defPosition8.setText("LeftOutsideLinebacker");
            defPosition9.setText("RightOutsideLinebacker");
            defPosition10.setText("LeftCornerback");
            defPosition11.setText("RightCornerback");
        }
    }//GEN-LAST:event_defFormItemStateChanged

    private void defNewPlaybookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defNewPlaybookBtnActionPerformed
        playCount = 1;
        offForm.setSelectedIndex(0);
        defForm.setSelectedIndex(0);
        initDSL();
    }//GEN-LAST:event_defNewPlaybookBtnActionPerformed

    private void defResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defResetBtnActionPerformed
        defReset();
        defPlaybook.setText("Defensive Playbook " + Integer.toString(playbookCount));
        defPlay.setText("Defensive Play " + Integer.toString(playCount));
        defForm.setSelectedIndex(0);
        defFormImage.setIcon(new ImageIcon(getClass().getResource("/seng6250/football/images/fourthree.png")));
        defFormImageLabel.setText("4-3 Formation");
        defPosition1.setText("LeftDefensiveEnd");
        defPosition2.setText("LeftDefensiveTackle");
        defPosition3.setText("RightDefensiveTackle");
        defPosition4.setText("RightDefensiveEnd");
        defPosition5.setText("LeftOutsideLinebacker");
        defPosition6.setText("MiddleLinebacker");
        defPosition7.setText("RightOutsideLinebacker");
        defPosition8.setText("LeftCornerback");
        defPosition9.setText("RightCornerback");
        defPosition10.setText("StrongSafety");
        defPosition11.setText("FreeSafety");
    }//GEN-LAST:event_defResetBtnActionPerformed

    private void goToOffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToOffBtnActionPerformed
        tabsContainer.setSelectedIndex(0);
    }//GEN-LAST:event_goToOffBtnActionPerformed

    private void generateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtn1ActionPerformed
        // Clear Previous Console Outputs
        offDSLDisplay.setText("");
        defDSLDisplay.setText("");
        simDisplay.setText("");
        offObjDisplay.setText("");
        defObjDisplay.setText("");
        
        // Build Offense Console Output
        offDSLDisplay.append("offensePlaybook ::= {\n");
        offDSLDisplay.append("    name ::= '" + offPlaybook.getText().trim() + "',\n");
        offDSLDisplay.append("    offensivePlay ::= {\n");
        offDSLDisplay.append("        name ::= '" + offPlay.getText().trim() + "',\n");
        offDSLDisplay.append("        formation ::= '" + offForm.getSelectedItem() + "',\n");
        offDSLDisplay.append("        playType ::= '" + offPlayType.getSelectedItem() + "',\n");
        offDSLDisplay.append("        playFocus ::= '" + offPlayFocus.getSelectedItem() + "',\n");
        offDSLDisplay.append("        players ::= {\n");
        offDSLDisplay.append("            " + offPosition1.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing1.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition2.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing2.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition3.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing3.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition4.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing4.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition5.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing5.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition6.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing6.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition7.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing7.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition8.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing8.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition9.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing9.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition10.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing10.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition11.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing11.getText().trim() + ")\n");
        offDSLDisplay.append("            }\n");
        offDSLDisplay.append("        }\n");
        offDSLDisplay.append("    }\n");
        offDSLDisplay.append("}");
        
        // Generate Offense DSL String
        offenseDSL = "offensePlaybook::={";
        offenseDSL += "name::='" + offPlaybook.getText().trim() + "',";
        offenseDSL += "offensivePlay::={";
        offenseDSL += "name::='" + offPlay.getText().trim() + "',";
        offenseDSL += "formation::='" + offForm.getSelectedItem() + "',";
        offenseDSL += "playType::='" + offPlayType.getSelectedItem() + "',";
        offenseDSL += "playFocus::='" + offPlayFocus.getSelectedItem() + "',";
        offenseDSL += "players::={";
        offenseDSL += offPosition1.getText() + "::={";
        offenseDSL += "(Agility," + offAgility1.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking1.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching1.getText().trim() + "),";
        offenseDSL += "(Power," + offPower1.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts1.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed1.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling1.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing1.getText().trim() + ")},";
        offenseDSL += offPosition2.getText() + "::={";
        offenseDSL += "(Agility," + offAgility2.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking2.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching2.getText().trim() + "),";
        offenseDSL += "(Power," + offPower2.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts2.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed2.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling2.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing2.getText().trim() + ")},";
        offenseDSL += offPosition3.getText() + "::={";
        offenseDSL += "(Agility," + offAgility3.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking3.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching3.getText().trim() + "),";
        offenseDSL += "(Power," + offPower3.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts3.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed3.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling3.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing3.getText().trim() + ")},";
        offenseDSL += offPosition4.getText() + "::={";
        offenseDSL += "(Agility," + offAgility4.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking4.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching4.getText().trim() + "),";
        offenseDSL += "(Power," + offPower4.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts4.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed4.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling4.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing4.getText().trim() + ")},";
        offenseDSL += offPosition5.getText() + "::={";
        offenseDSL += "(Agility," + offAgility5.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking5.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching5.getText().trim() + "),";
        offenseDSL += "(Power," + offPower5.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts5.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed5.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling5.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing5.getText().trim() + ")},";
        offenseDSL += offPosition6.getText() + "::={";
        offenseDSL += "(Agility," + offAgility6.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking6.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching6.getText().trim() + "),";
        offenseDSL += "(Power," + offPower6.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts6.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed6.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling6.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing6.getText().trim() + ")},";
        offenseDSL += offPosition7.getText() + "::={";
        offenseDSL += "(Agility," + offAgility7.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking7.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching7.getText().trim() + "),";
        offenseDSL += "(Power," + offPower7.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts7.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed7.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling7.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing7.getText().trim() + ")},";
        offenseDSL += offPosition8.getText() + "::={";
        offenseDSL += "(Agility," + offAgility8.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking8.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching8.getText().trim() + "),";
        offenseDSL += "(Power," + offPower8.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts8.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed8.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling8.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing8.getText().trim() + ")},";
        offenseDSL += offPosition9.getText() + "::={";
        offenseDSL += "(Agility," + offAgility9.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking9.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching9.getText().trim() + "),";
        offenseDSL += "(Power," + offPower9.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts9.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed9.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling9.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing9.getText().trim() + ")},";
        offenseDSL += offPosition10.getText() + "::={";
        offenseDSL += "(Agility," + offAgility10.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking10.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching10.getText().trim() + "),";
        offenseDSL += "(Power," + offPower10.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts10.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed10.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling10.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing10.getText().trim() + ")},";
        offenseDSL += offPosition11.getText() + "::={";
        offenseDSL += "(Agility," + offAgility11.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking11.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching11.getText().trim() + "),";
        offenseDSL += "(Power," + offPower11.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts11.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed11.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling11.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing11.getText().trim() + ")}}}}";
        
        // Build Defense Console Output
        defDSLDisplay.append("defensePlaybook ::= {\n");
        defDSLDisplay.append("    name ::= '" + defPlaybook.getText().trim() + "',\n");
        defDSLDisplay.append("    defensivePlay ::= {\n");
        defDSLDisplay.append("        name ::= '" + defPlay.getText().trim() + "',\n");
        defDSLDisplay.append("        formation ::= '" + defForm.getSelectedItem() + "',\n");
        defDSLDisplay.append("        playType ::= '" + defPlayType.getSelectedItem() + "',\n");
        defDSLDisplay.append("        playFocus ::= '" + defPlayFocus.getSelectedItem() + "',\n");
        defDSLDisplay.append("        players ::= {\n");
        defDSLDisplay.append("            " + defPosition1.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing1.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition2.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing2.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition3.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing3.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition4.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing4.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition5.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing5.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition6.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing6.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition7.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing7.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition8.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing8.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition9.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing9.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition10.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing10.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition11.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing11.getText().trim() + ")\n");
        defDSLDisplay.append("            }\n");
        defDSLDisplay.append("        }\n");
        defDSLDisplay.append("    }\n");
        defDSLDisplay.append("}");
        
        // Generate Defense DSL String
        defenseDSL = "defensePlaybook::={";
        defenseDSL += "name::='" + defPlaybook.getText().trim() + "',";
        defenseDSL += "defensivePlay::={";
        defenseDSL += "name::='" + defPlay.getText().trim() + "',";
        defenseDSL += "formation::='" + defForm.getSelectedItem() + "',";
        defenseDSL += "playType::='" + defPlayType.getSelectedItem() + "',";
        defenseDSL += "playFocus::='" + defPlayFocus.getSelectedItem() + "',";
        defenseDSL += "players::={";
        defenseDSL += defPosition1.getText() + "::={";
        defenseDSL += "(Agility," + defAgility1.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking1.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching1.getText().trim() + "),";
        defenseDSL += "(Power," + defPower1.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts1.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed1.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling1.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing1.getText().trim() + ")},";
        defenseDSL += defPosition2.getText() + "::={";
        defenseDSL += "(Agility," + defAgility2.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking2.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching2.getText().trim() + "),";
        defenseDSL += "(Power," + defPower2.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts2.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed2.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling2.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing2.getText().trim() + ")},";
        defenseDSL += defPosition3.getText() + "::={";
        defenseDSL += "(Agility," + defAgility3.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking3.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching3.getText().trim() + "),";
        defenseDSL += "(Power," + defPower3.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts3.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed3.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling3.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing3.getText().trim() + ")},";
        defenseDSL += defPosition4.getText() + "::={";
        defenseDSL += "(Agility," + defAgility4.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking4.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching4.getText().trim() + "),";
        defenseDSL += "(Power," + defPower4.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts4.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed4.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling4.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing4.getText().trim() + ")},";
        defenseDSL += defPosition5.getText() + "::={";
        defenseDSL += "(Agility," + defAgility5.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking5.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching5.getText().trim() + "),";
        defenseDSL += "(Power," + defPower5.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts5.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed5.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling5.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing5.getText().trim() + ")},";
        defenseDSL += defPosition6.getText() + "::={";
        defenseDSL += "(Agility," + defAgility6.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking6.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching6.getText().trim() + "),";
        defenseDSL += "(Power," + defPower6.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts6.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed6.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling6.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing6.getText().trim() + ")},";
        defenseDSL += defPosition7.getText() + "::={";
        defenseDSL += "(Agility," + defAgility7.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking7.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching7.getText().trim() + "),";
        defenseDSL += "(Power," + defPower7.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts7.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed7.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling7.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing7.getText().trim() + ")},";
        defenseDSL += defPosition8.getText() + "::={";
        defenseDSL += "(Agility," + defAgility8.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking8.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching8.getText().trim() + "),";
        defenseDSL += "(Power," + defPower8.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts8.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed8.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling8.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing8.getText().trim() + ")},";
        defenseDSL += defPosition9.getText() + "::={";
        defenseDSL += "(Agility," + defAgility9.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking9.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching9.getText().trim() + "),";
        defenseDSL += "(Power," + defPower9.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts9.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed9.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling9.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing9.getText().trim() + ")},";
        defenseDSL += defPosition10.getText() + "::={";
        defenseDSL += "(Agility," + defAgility10.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking10.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching10.getText().trim() + "),";
        defenseDSL += "(Power," + defPower10.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts10.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed10.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling10.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing10.getText().trim() + ")},";
        defenseDSL += defPosition11.getText() + "::={";
        defenseDSL += "(Agility," + defAgility11.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking11.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching11.getText().trim() + "),";
        defenseDSL += "(Power," + defPower11.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts11.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed11.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling11.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing11.getText().trim() + ")}}}}";
        
        // parse the DSL strings
        String dslError = "";
        String dslResult = "";
        OffensivePlaybook offPB;
        DefensivePlaybook defPB;
        FootballDSLObjectifier dslObj = new FootballDSLObjectifier();
        
        try {
            offPB = dslObj.getOffensivePlaybook(offenseDSL);
            defPB = dslObj.getDefensivePlaybook(defenseDSL);
            
            OutcomeGenerator simGen = new OutcomeGenerator(offPB.plays.get(0), defPB.plays.get(0));
            dslResult = simGen.getOutcome();
            
            // send the play outcome to the simulator console
            simDisplay.append(dslResult);
            
            // send the offensive playbook object toString to the Offense Playbook Object Console
            offObjDisplay.append(offPB.toString());
            
            // send the defensive playbook object toString to the Defense Playbook Object Console
            defObjDisplay.append(defPB.toString());
        } catch (Exception ex) {
            dslError += "There was a problem parsing the DSL.\n";
            simDisplay.append(dslError);
        }
        
        // Setup Next Build
        playCount++;
        offPlay.setText("Offensive Play " + Integer.toString(playCount));
        defPlay.setText("Defensive Play " + Integer.toString(playCount));
        
        // Switch Display to Console Tab
        tabsContainer.setSelectedIndex(2);
    }//GEN-LAST:event_generateBtn1ActionPerformed

    private void generateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtn2ActionPerformed
        // Clear Previous Console Outputs
        offDSLDisplay.setText("");
        defDSLDisplay.setText("");
        simDisplay.setText("");
        offObjDisplay.setText("");
        defObjDisplay.setText("");
        
        // Build Offense Console Output
        offDSLDisplay.append("offensePlaybook ::= {\n");
        offDSLDisplay.append("    name ::= '" + offPlaybook.getText().trim() + "',\n");
        offDSLDisplay.append("    offensivePlay ::= {\n");
        offDSLDisplay.append("        name ::= '" + offPlay.getText().trim() + "',\n");
        offDSLDisplay.append("        formation ::= '" + offForm.getSelectedItem() + "',\n");
        offDSLDisplay.append("        playType ::= '" + offPlayType.getSelectedItem() + "',\n");
        offDSLDisplay.append("        playFocus ::= '" + offPlayFocus.getSelectedItem() + "',\n");
        offDSLDisplay.append("        players ::= {\n");
        offDSLDisplay.append("            " + offPosition1.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling1.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing1.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition2.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling2.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing2.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition3.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling3.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing3.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition4.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling4.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing4.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition5.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling5.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing5.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition6.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling6.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing6.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition7.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling7.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing7.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition8.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling8.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing8.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition9.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling9.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing9.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition10.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling10.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing10.getText().trim() + ")\n");
        offDSLDisplay.append("            },\n");
        offDSLDisplay.append("            " + offPosition11.getText() + " ::= {\n");
        offDSLDisplay.append("                (Agility, " + offAgility11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Blocking, " + offBlocking11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Catching, " + offCatching11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Power, " + offPower11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Smarts, " + offSmarts11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Speed, " + offSpeed11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Tackling, " + offTackling11.getText().trim() + "),\n");
        offDSLDisplay.append("                (Throwing, " + offThrowing11.getText().trim() + ")\n");
        offDSLDisplay.append("            }\n");
        offDSLDisplay.append("        }\n");
        offDSLDisplay.append("    }\n");
        offDSLDisplay.append("}");
        
        // Generate Offense DSL String
        offenseDSL = "offensePlaybook::={";
        offenseDSL += "name::='" + offPlaybook.getText().trim() + "',";
        offenseDSL += "offensivePlay::={";
        offenseDSL += "name::='" + offPlay.getText().trim() + "',";
        offenseDSL += "formation::='" + offForm.getSelectedItem() + "',";
        offenseDSL += "playType::='" + offPlayType.getSelectedItem() + "',";
        offenseDSL += "playFocus::='" + offPlayFocus.getSelectedItem() + "',";
        offenseDSL += "players::={";
        offenseDSL += offPosition1.getText() + "::={";
        offenseDSL += "(Agility," + offAgility1.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking1.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching1.getText().trim() + "),";
        offenseDSL += "(Power," + offPower1.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts1.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed1.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling1.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing1.getText().trim() + ")},";
        offenseDSL += offPosition2.getText() + "::={";
        offenseDSL += "(Agility," + offAgility2.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking2.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching2.getText().trim() + "),";
        offenseDSL += "(Power," + offPower2.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts2.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed2.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling2.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing2.getText().trim() + ")},";
        offenseDSL += offPosition3.getText() + "::={";
        offenseDSL += "(Agility," + offAgility3.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking3.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching3.getText().trim() + "),";
        offenseDSL += "(Power," + offPower3.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts3.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed3.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling3.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing3.getText().trim() + ")},";
        offenseDSL += offPosition4.getText() + "::={";
        offenseDSL += "(Agility," + offAgility4.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking4.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching4.getText().trim() + "),";
        offenseDSL += "(Power," + offPower4.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts4.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed4.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling4.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing4.getText().trim() + ")},";
        offenseDSL += offPosition5.getText() + "::={";
        offenseDSL += "(Agility," + offAgility5.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking5.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching5.getText().trim() + "),";
        offenseDSL += "(Power," + offPower5.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts5.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed5.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling5.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing5.getText().trim() + ")},";
        offenseDSL += offPosition6.getText() + "::={";
        offenseDSL += "(Agility," + offAgility6.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking6.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching6.getText().trim() + "),";
        offenseDSL += "(Power," + offPower6.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts6.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed6.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling6.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing6.getText().trim() + ")},";
        offenseDSL += offPosition7.getText() + "::={";
        offenseDSL += "(Agility," + offAgility7.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking7.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching7.getText().trim() + "),";
        offenseDSL += "(Power," + offPower7.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts7.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed7.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling7.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing7.getText().trim() + ")},";
        offenseDSL += offPosition8.getText() + "::={";
        offenseDSL += "(Agility," + offAgility8.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking8.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching8.getText().trim() + "),";
        offenseDSL += "(Power," + offPower8.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts8.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed8.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling8.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing8.getText().trim() + ")},";
        offenseDSL += offPosition9.getText() + "::={";
        offenseDSL += "(Agility," + offAgility9.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking9.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching9.getText().trim() + "),";
        offenseDSL += "(Power," + offPower9.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts9.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed9.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling9.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing9.getText().trim() + ")},";
        offenseDSL += offPosition10.getText() + "::={";
        offenseDSL += "(Agility," + offAgility10.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking10.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching10.getText().trim() + "),";
        offenseDSL += "(Power," + offPower10.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts10.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed10.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling10.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing10.getText().trim() + ")},";
        offenseDSL += offPosition11.getText() + "::={";
        offenseDSL += "(Agility," + offAgility11.getText().trim() + "),";
        offenseDSL += "(Blocking," + offBlocking11.getText().trim() + "),";
        offenseDSL += "(Catching," + offCatching11.getText().trim() + "),";
        offenseDSL += "(Power," + offPower11.getText().trim() + "),";
        offenseDSL += "(Smarts," + offSmarts11.getText().trim() + "),";
        offenseDSL += "(Speed," + offSpeed11.getText().trim() + "),";
        offenseDSL += "(Tackling," + offTackling11.getText().trim() + "),";
        offenseDSL += "(Throwing," + offThrowing11.getText().trim() + ")}}}}";
        
        // Build Defense Console Output
        defDSLDisplay.append("defensePlaybook ::= {\n");
        defDSLDisplay.append("    name ::= '" + defPlaybook.getText().trim() + "',\n");
        defDSLDisplay.append("    defensivePlay ::= {\n");
        defDSLDisplay.append("        name ::= '" + defPlay.getText().trim() + "',\n");
        defDSLDisplay.append("        formation ::= '" + defForm.getSelectedItem() + "',\n");
        defDSLDisplay.append("        playType ::= '" + defPlayType.getSelectedItem() + "'\n");
        defDSLDisplay.append("        playFocus ::= '" + defPlayFocus.getSelectedItem() + "'\n");
        defDSLDisplay.append("        players ::= {\n");
        defDSLDisplay.append("            " + defPosition1.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling1.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing1.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition2.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling2.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing2.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition3.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling3.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing3.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition4.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling4.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing4.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition5.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling5.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing5.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition6.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling6.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing6.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition7.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling7.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing7.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition8.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling8.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing8.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition9.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling9.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing9.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition10.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling10.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing10.getText().trim() + ")\n");
        defDSLDisplay.append("            },\n");
        defDSLDisplay.append("            " + defPosition11.getText() + " ::= {\n");
        defDSLDisplay.append("                (Agility, " + defAgility11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Blocking, " + defBlocking11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Catching, " + defCatching11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Power, " + defPower11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Smarts, " + defSmarts11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Speed, " + defSpeed11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Tackling, " + defTackling11.getText().trim() + "),\n");
        defDSLDisplay.append("                (Throwing, " + defThrowing11.getText().trim() + ")\n");
        defDSLDisplay.append("            }\n");
        defDSLDisplay.append("        }\n");
        defDSLDisplay.append("    }\n");
        defDSLDisplay.append("}");
        
        // Generate Defense DSL String
        defenseDSL = "defensePlaybook::={";
        defenseDSL += "name::='" + defPlaybook.getText().trim() + "',";
        defenseDSL += "defensivePlay::={";
        defenseDSL += "name::='" + defPlay.getText().trim() + "',";
        defenseDSL += "formation::='" + defForm.getSelectedItem() + "',";
        defenseDSL += "playType::='" + defPlayType.getSelectedItem() + "',";
        defenseDSL += "playFocus::='" + defPlayFocus.getSelectedItem() + "',";
        defenseDSL += "players::={";
        defenseDSL += defPosition1.getText() + "::={";
        defenseDSL += "(Agility," + defAgility1.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking1.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching1.getText().trim() + "),";
        defenseDSL += "(Power," + defPower1.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts1.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed1.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling1.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing1.getText().trim() + ")},";
        defenseDSL += defPosition2.getText() + "::={";
        defenseDSL += "(Agility," + defAgility2.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking2.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching2.getText().trim() + "),";
        defenseDSL += "(Power," + defPower2.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts2.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed2.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling2.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing2.getText().trim() + ")},";
        defenseDSL += defPosition3.getText() + "::={";
        defenseDSL += "(Agility," + defAgility3.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking3.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching3.getText().trim() + "),";
        defenseDSL += "(Power," + defPower3.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts3.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed3.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling3.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing3.getText().trim() + ")},";
        defenseDSL += defPosition4.getText() + "::={";
        defenseDSL += "(Agility," + defAgility4.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking4.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching4.getText().trim() + "),";
        defenseDSL += "(Power," + defPower4.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts4.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed4.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling4.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing4.getText().trim() + ")},";
        defenseDSL += defPosition5.getText() + "::={";
        defenseDSL += "(Agility," + defAgility5.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking5.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching5.getText().trim() + "),";
        defenseDSL += "(Power," + defPower5.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts5.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed5.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling5.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing5.getText().trim() + ")},";
        defenseDSL += defPosition6.getText() + "::={";
        defenseDSL += "(Agility," + defAgility6.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking6.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching6.getText().trim() + "),";
        defenseDSL += "(Power," + defPower6.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts6.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed6.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling6.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing6.getText().trim() + ")},";
        defenseDSL += defPosition7.getText() + "::={";
        defenseDSL += "(Agility," + defAgility7.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking7.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching7.getText().trim() + "),";
        defenseDSL += "(Power," + defPower7.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts7.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed7.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling7.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing7.getText().trim() + ")},";
        defenseDSL += defPosition8.getText() + "::={";
        defenseDSL += "(Agility," + defAgility8.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking8.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching8.getText().trim() + "),";
        defenseDSL += "(Power," + defPower8.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts8.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed8.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling8.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing8.getText().trim() + ")},";
        defenseDSL += defPosition9.getText() + "::={";
        defenseDSL += "(Agility," + defAgility9.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking9.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching9.getText().trim() + "),";
        defenseDSL += "(Power," + defPower9.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts9.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed9.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling9.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing9.getText().trim() + ")},";
        defenseDSL += defPosition10.getText() + "::={";
        defenseDSL += "(Agility," + defAgility10.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking10.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching10.getText().trim() + "),";
        defenseDSL += "(Power," + defPower10.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts10.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed10.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling10.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing10.getText().trim() + ")},";
        defenseDSL += defPosition11.getText() + "::={";
        defenseDSL += "(Agility," + defAgility11.getText().trim() + "),";
        defenseDSL += "(Blocking," + defBlocking11.getText().trim() + "),";
        defenseDSL += "(Catching," + defCatching11.getText().trim() + "),";
        defenseDSL += "(Power," + defPower11.getText().trim() + "),";
        defenseDSL += "(Smarts," + defSmarts11.getText().trim() + "),";
        defenseDSL += "(Speed," + defSpeed11.getText().trim() + "),";
        defenseDSL += "(Tackling," + defTackling11.getText().trim() + "),";
        defenseDSL += "(Throwing," + defThrowing11.getText().trim() + ")}}}}";
        
        // parse the DSL strings
        String dslError = "";
        String dslResult = "";
        OffensivePlaybook offPB;
        DefensivePlaybook defPB;
        FootballDSLObjectifier dslObj = new FootballDSLObjectifier();
        
        try {
            offPB = dslObj.getOffensivePlaybook(offenseDSL);
            defPB = dslObj.getDefensivePlaybook(defenseDSL);
            
            OutcomeGenerator simGen = new OutcomeGenerator(offPB.plays.get(0), defPB.plays.get(0));
            dslResult = simGen.getOutcome();
            
            // send the play outcome to the simulator console
            simDisplay.append(dslResult);
            
            // send the offensive playbook object toString to the Offense Playbook Object Console
            offObjDisplay.append(offPB.toString());
            
            // send the defensive playbook object toString to the Defense Playbook Object Console
            defObjDisplay.append(defPB.toString());
        } catch (Exception ex) {
            dslError += "There was a problem parsing the DSL.\n";
            simDisplay.append(dslError);
        }
        
        // Setup Next Build
        playCount++;
        offPlay.setText("Offensive Play " + Integer.toString(playCount));
        defPlay.setText("Defensive Play " + Integer.toString(playCount));
        
        // Switch Display to Console Tab
        tabsContainer.setSelectedIndex(2);
    }//GEN-LAST:event_generateBtn2ActionPerformed

    // user-defined variables
    private int playCount = 1;
    private int playbookCount = 0;
    private String offenseDSL = "";
    private String defenseDSL = "";
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FootballDSLGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FootballDSLGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel consoleTab;
    private javax.swing.JTextField defAgility1;
    private javax.swing.JTextField defAgility10;
    private javax.swing.JTextField defAgility11;
    private javax.swing.JTextField defAgility2;
    private javax.swing.JTextField defAgility3;
    private javax.swing.JTextField defAgility4;
    private javax.swing.JTextField defAgility5;
    private javax.swing.JTextField defAgility6;
    private javax.swing.JTextField defAgility7;
    private javax.swing.JTextField defAgility8;
    private javax.swing.JTextField defAgility9;
    private javax.swing.JLabel defAgilityHdr;
    private javax.swing.JTextField defBlocking1;
    private javax.swing.JTextField defBlocking10;
    private javax.swing.JTextField defBlocking11;
    private javax.swing.JTextField defBlocking2;
    private javax.swing.JTextField defBlocking3;
    private javax.swing.JTextField defBlocking4;
    private javax.swing.JTextField defBlocking5;
    private javax.swing.JTextField defBlocking6;
    private javax.swing.JTextField defBlocking7;
    private javax.swing.JTextField defBlocking8;
    private javax.swing.JTextField defBlocking9;
    private javax.swing.JLabel defBlockingHdr;
    private javax.swing.JTextField defCatching1;
    private javax.swing.JTextField defCatching10;
    private javax.swing.JTextField defCatching11;
    private javax.swing.JTextField defCatching2;
    private javax.swing.JTextField defCatching3;
    private javax.swing.JTextField defCatching4;
    private javax.swing.JTextField defCatching5;
    private javax.swing.JTextField defCatching6;
    private javax.swing.JTextField defCatching7;
    private javax.swing.JTextField defCatching8;
    private javax.swing.JTextField defCatching9;
    private javax.swing.JLabel defCatchingHdr;
    private javax.swing.JScrollPane defDSLContainer;
    private javax.swing.JTextArea defDSLDisplay;
    private javax.swing.JComboBox defForm;
    private javax.swing.JLabel defFormImage;
    private javax.swing.JPanel defFormImageContainer;
    private javax.swing.JLabel defFormImageLabel;
    private javax.swing.JLabel defFormLabel;
    private javax.swing.JLabel defMainLabel;
    private javax.swing.JButton defNewPlaybookBtn;
    private javax.swing.JScrollPane defObjContainer;
    private javax.swing.JTextArea defObjDisplay;
    private javax.swing.JTextField defPlay;
    private javax.swing.JComboBox defPlayFocus;
    private javax.swing.JLabel defPlayLabel;
    private javax.swing.JComboBox defPlayType;
    private javax.swing.JLabel defPlayTypeLabel;
    private javax.swing.JTextField defPlaybook;
    private javax.swing.JLabel defPlaybookLabel;
    private javax.swing.JLabel defPosition1;
    private javax.swing.JLabel defPosition10;
    private javax.swing.JLabel defPosition11;
    private javax.swing.JLabel defPosition2;
    private javax.swing.JLabel defPosition3;
    private javax.swing.JLabel defPosition4;
    private javax.swing.JLabel defPosition5;
    private javax.swing.JLabel defPosition6;
    private javax.swing.JLabel defPosition7;
    private javax.swing.JLabel defPosition8;
    private javax.swing.JLabel defPosition9;
    private javax.swing.JLabel defPositionHdr;
    private javax.swing.JTextField defPower1;
    private javax.swing.JTextField defPower10;
    private javax.swing.JTextField defPower11;
    private javax.swing.JTextField defPower2;
    private javax.swing.JTextField defPower3;
    private javax.swing.JTextField defPower4;
    private javax.swing.JTextField defPower5;
    private javax.swing.JTextField defPower6;
    private javax.swing.JTextField defPower7;
    private javax.swing.JTextField defPower8;
    private javax.swing.JTextField defPower9;
    private javax.swing.JLabel defPowerHdr;
    private javax.swing.JButton defResetBtn;
    private javax.swing.JPanel defSkillContainer;
    private javax.swing.JSeparator defSkillHorSep;
    private javax.swing.JTextField defSmarts1;
    private javax.swing.JTextField defSmarts10;
    private javax.swing.JTextField defSmarts11;
    private javax.swing.JTextField defSmarts2;
    private javax.swing.JTextField defSmarts3;
    private javax.swing.JTextField defSmarts4;
    private javax.swing.JTextField defSmarts5;
    private javax.swing.JTextField defSmarts6;
    private javax.swing.JTextField defSmarts7;
    private javax.swing.JTextField defSmarts8;
    private javax.swing.JTextField defSmarts9;
    private javax.swing.JLabel defSmartsHdr;
    private javax.swing.JTextField defSpeed1;
    private javax.swing.JTextField defSpeed10;
    private javax.swing.JTextField defSpeed11;
    private javax.swing.JTextField defSpeed2;
    private javax.swing.JTextField defSpeed3;
    private javax.swing.JTextField defSpeed4;
    private javax.swing.JTextField defSpeed5;
    private javax.swing.JTextField defSpeed6;
    private javax.swing.JTextField defSpeed7;
    private javax.swing.JTextField defSpeed8;
    private javax.swing.JTextField defSpeed9;
    private javax.swing.JLabel defSpeedHdr;
    private javax.swing.JPanel defTab;
    private javax.swing.JTextField defTackling1;
    private javax.swing.JTextField defTackling10;
    private javax.swing.JTextField defTackling11;
    private javax.swing.JTextField defTackling2;
    private javax.swing.JTextField defTackling3;
    private javax.swing.JTextField defTackling4;
    private javax.swing.JTextField defTackling5;
    private javax.swing.JTextField defTackling6;
    private javax.swing.JTextField defTackling7;
    private javax.swing.JTextField defTackling8;
    private javax.swing.JTextField defTackling9;
    private javax.swing.JLabel defTacklingHdr;
    private javax.swing.JTextField defThrowing1;
    private javax.swing.JTextField defThrowing10;
    private javax.swing.JTextField defThrowing11;
    private javax.swing.JTextField defThrowing2;
    private javax.swing.JTextField defThrowing3;
    private javax.swing.JTextField defThrowing4;
    private javax.swing.JTextField defThrowing5;
    private javax.swing.JTextField defThrowing6;
    private javax.swing.JTextField defThrowing7;
    private javax.swing.JTextField defThrowing8;
    private javax.swing.JTextField defThrowing9;
    private javax.swing.JLabel defThrowingHdr;
    private javax.swing.JLabel deffPlayFocusLabel;
    private javax.swing.JButton generateBtn1;
    private javax.swing.JButton generateBtn2;
    private javax.swing.JButton goToDefBtn;
    private javax.swing.JButton goToOffBtn;
    private javax.swing.JTextField offAgility1;
    private javax.swing.JTextField offAgility10;
    private javax.swing.JTextField offAgility11;
    private javax.swing.JTextField offAgility2;
    private javax.swing.JTextField offAgility3;
    private javax.swing.JTextField offAgility4;
    private javax.swing.JTextField offAgility5;
    private javax.swing.JTextField offAgility6;
    private javax.swing.JTextField offAgility7;
    private javax.swing.JTextField offAgility8;
    private javax.swing.JTextField offAgility9;
    private javax.swing.JLabel offAgilityHdr;
    private javax.swing.JTextField offBlocking1;
    private javax.swing.JTextField offBlocking10;
    private javax.swing.JTextField offBlocking11;
    private javax.swing.JTextField offBlocking2;
    private javax.swing.JTextField offBlocking3;
    private javax.swing.JTextField offBlocking4;
    private javax.swing.JTextField offBlocking5;
    private javax.swing.JTextField offBlocking6;
    private javax.swing.JTextField offBlocking7;
    private javax.swing.JTextField offBlocking8;
    private javax.swing.JTextField offBlocking9;
    private javax.swing.JLabel offBlockingHdr;
    private javax.swing.JTextField offCatching1;
    private javax.swing.JTextField offCatching10;
    private javax.swing.JTextField offCatching11;
    private javax.swing.JTextField offCatching2;
    private javax.swing.JTextField offCatching3;
    private javax.swing.JTextField offCatching4;
    private javax.swing.JTextField offCatching5;
    private javax.swing.JTextField offCatching6;
    private javax.swing.JTextField offCatching7;
    private javax.swing.JTextField offCatching8;
    private javax.swing.JTextField offCatching9;
    private javax.swing.JLabel offCatchingHdr;
    private javax.swing.JScrollPane offDSLContainer;
    private javax.swing.JTextArea offDSLDisplay;
    private javax.swing.JComboBox offForm;
    private javax.swing.JLabel offFormImage;
    private javax.swing.JPanel offFormImageContainer;
    private javax.swing.JLabel offFormImageLabel;
    private javax.swing.JLabel offFormLabel;
    private javax.swing.JLabel offMainLabel;
    private javax.swing.JButton offNewPlaybookBtn;
    private javax.swing.JScrollPane offObjContainer;
    private javax.swing.JTextArea offObjDisplay;
    private javax.swing.JTextField offPlay;
    private javax.swing.JComboBox offPlayFocus;
    private javax.swing.JLabel offPlayFocusLabel;
    private javax.swing.JLabel offPlayLabel;
    private javax.swing.JComboBox offPlayType;
    private javax.swing.JLabel offPlayTypeLabel;
    private javax.swing.JTextField offPlaybook;
    private javax.swing.JLabel offPlaybookLabel;
    private javax.swing.JLabel offPosition1;
    private javax.swing.JLabel offPosition10;
    private javax.swing.JLabel offPosition11;
    private javax.swing.JLabel offPosition2;
    private javax.swing.JLabel offPosition3;
    private javax.swing.JLabel offPosition4;
    private javax.swing.JLabel offPosition5;
    private javax.swing.JLabel offPosition6;
    private javax.swing.JLabel offPosition7;
    private javax.swing.JLabel offPosition8;
    private javax.swing.JLabel offPosition9;
    private javax.swing.JLabel offPositionHdr;
    private javax.swing.JTextField offPower1;
    private javax.swing.JTextField offPower10;
    private javax.swing.JTextField offPower11;
    private javax.swing.JTextField offPower2;
    private javax.swing.JTextField offPower3;
    private javax.swing.JTextField offPower4;
    private javax.swing.JTextField offPower5;
    private javax.swing.JTextField offPower6;
    private javax.swing.JTextField offPower7;
    private javax.swing.JTextField offPower8;
    private javax.swing.JTextField offPower9;
    private javax.swing.JLabel offPowerHdr;
    private javax.swing.JButton offResetBtn;
    private javax.swing.JSeparator offSkillHorSep;
    private javax.swing.JTextField offSmarts1;
    private javax.swing.JTextField offSmarts10;
    private javax.swing.JTextField offSmarts11;
    private javax.swing.JTextField offSmarts2;
    private javax.swing.JTextField offSmarts3;
    private javax.swing.JTextField offSmarts4;
    private javax.swing.JTextField offSmarts5;
    private javax.swing.JTextField offSmarts6;
    private javax.swing.JTextField offSmarts7;
    private javax.swing.JTextField offSmarts8;
    private javax.swing.JTextField offSmarts9;
    private javax.swing.JLabel offSmartsHdr;
    private javax.swing.JTextField offSpeed1;
    private javax.swing.JTextField offSpeed10;
    private javax.swing.JTextField offSpeed11;
    private javax.swing.JTextField offSpeed2;
    private javax.swing.JTextField offSpeed3;
    private javax.swing.JTextField offSpeed4;
    private javax.swing.JTextField offSpeed5;
    private javax.swing.JTextField offSpeed6;
    private javax.swing.JTextField offSpeed7;
    private javax.swing.JTextField offSpeed8;
    private javax.swing.JTextField offSpeed9;
    private javax.swing.JLabel offSpeedHdr;
    private javax.swing.JPanel offTab;
    private javax.swing.JTextField offTackling1;
    private javax.swing.JTextField offTackling10;
    private javax.swing.JTextField offTackling11;
    private javax.swing.JTextField offTackling2;
    private javax.swing.JTextField offTackling3;
    private javax.swing.JTextField offTackling4;
    private javax.swing.JTextField offTackling5;
    private javax.swing.JTextField offTackling6;
    private javax.swing.JTextField offTackling7;
    private javax.swing.JTextField offTackling8;
    private javax.swing.JTextField offTackling9;
    private javax.swing.JLabel offTacklingHdr;
    private javax.swing.JTextField offThrowing1;
    private javax.swing.JTextField offThrowing10;
    private javax.swing.JTextField offThrowing11;
    private javax.swing.JTextField offThrowing2;
    private javax.swing.JTextField offThrowing3;
    private javax.swing.JTextField offThrowing4;
    private javax.swing.JTextField offThrowing5;
    private javax.swing.JTextField offThrowing6;
    private javax.swing.JTextField offThrowing7;
    private javax.swing.JTextField offThrowing8;
    private javax.swing.JTextField offThrowing9;
    private javax.swing.JLabel offThrowingHdr;
    private javax.swing.JScrollPane simContainer;
    private javax.swing.JTextArea simDisplay;
    private javax.swing.JPanel skillContainer;
    private javax.swing.JTabbedPane tabsContainer;
    // End of variables declaration//GEN-END:variables
}