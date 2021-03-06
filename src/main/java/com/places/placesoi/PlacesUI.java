/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.places.placesoi;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;


/**
 *
 * @author vasilis
 */
public class PlacesUI extends javax.swing.JFrame {
    
    /**
     * Creates new form PlacesUI
     */
    public PlacesUI() {
        initComponents();
    }
    
    private JSONArray results = new JSONArray();
    final String googleKey = "AIzaSyDNB7pqar99CArd1wtOo89lhQsE8TbdA7w";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLng = new javax.swing.JTextField();
        txtLat = new javax.swing.JTextField();
        txtRad = new javax.swing.JTextField();
        retrievePoisButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        poiList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        typeList = new javax.swing.JList();
        imageLabel = new javax.swing.JLabel();
        distanceLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POI Retriever - Pervasive Computing MSc Cource 2015");

        jLabel1.setText("Γεωγ. Μήκος");

        jLabel2.setText("Γεωγ. Πλάτος");

        jLabel3.setText("Ακτίνα (m)");

        txtLng.setText("23.725753");
        txtLng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLngActionPerformed(evt);
            }
        });

        txtLat.setText("37.976104");
        txtLat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLatActionPerformed(evt);
            }
        });

        txtRad.setText("800");

        retrievePoisButton.setText("Retrieve POIs");
        retrievePoisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrievePoisButtonActionPerformed(evt);
            }
        });

        poiList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        poiList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                poiListPropertyChange(evt);
            }
        });
        poiList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                poiListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(poiList);

        typeList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Lodging", "Food", "Cafe", "Night Club", "Car Rental", "Museum", "Church", "Hospital", "Pharmacy", "Police", "Post Office" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        typeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(typeList);

        distanceLabel.setText(" ");

        addressLabel.setText(" ");

        ratingLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLng, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtLat)
                            .addComponent(txtRad)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(distanceLabel)
                            .addComponent(addressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ratingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retrievePoisButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                            .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(retrievePoisButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ratingLabel)
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(distanceLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addressLabel)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtLng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLatActionPerformed

    private void retrievePoisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrievePoisButtonActionPerformed
        String[] types = {"lodging","food","cafe","night_club","car_rental","museum","church","hospital","pharmacy","police","post_office"};
        float lat,lng;
        int rad;
        String placeType = "cafe"; // initialize
        try {
            lat = Float.parseFloat(txtLat.getText());
            lng = Float.parseFloat(txtLng.getText());
            rad = Integer.parseInt(txtRad.getText());
            if(typeList.getSelectedIndex()!=-1){
                placeType = types[typeList.getSelectedIndex()];
            }else{
                typeList.setSelectedIndex(2);
                placeType = types[2]; // default to cafe
            }
            handleCall(lat, lng, rad, placeType);
        } catch (UnirestException | ParseException e) {
            System.out.println("Caught Exception: "+e);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter appropriate coordinates or distance", "Oops", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_retrievePoisButtonActionPerformed

    private void txtLngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLngActionPerformed

    private void poiListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_poiListValueChanged
        int resultIndex = poiList.getSelectedIndex();
        System.out.println("user selected details for "+this.results.getJSONObject(resultIndex).getString("name"));
        imageLabel.setIcon(null); // empty the image container in case there is no new photo to show
        imageLabel.setText(null);
        imageLabel.revalidate();
        displayPlaceDetails(resultIndex);
        
    }//GEN-LAST:event_poiListValueChanged

    private void poiListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_poiListPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_poiListPropertyChange
    
    private void listPois(String[] names){
        final String[] strings = names; 
        poiList.setModel(new javax.swing.AbstractListModel() {
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
    };
    
    private ImageIcon fetchPlacePhoto(String photo_reference){
        String url = "https://maps.googleapis.com/maps/api/place/photo?maxheight=230"
                +"&photoreference="+photo_reference
                +"&key="+this.googleKey;
      
        BufferedImage image = new BufferedImage(1,1,1);
        try{
            System.out.println("querying photo from: "+url);
            URL imageUrl = new URL(url);
            image = ImageIO.read(imageUrl);
        }catch(IOException e){
            imageLabel.setText("no image found");
            imageLabel.revalidate();
            System.err.println(e);
        }
        return new ImageIcon(image);
    };
            
    private void displayPlaceDetails(int placeIndex){
        
        /* Display place details */
        JSONObject jsonObj = this.results.getJSONObject(placeIndex);
        try{    // Google has no rating for places like museums, so we will have to try/catch here
            double p = jsonObj.getDouble("rating");
            ratingLabel.setText("Rating: "+p);
        }catch(Exception e){
            ratingLabel.setText("Rating: N/A");
        }

        JSONObject location = jsonObj.getJSONObject("geometry").getJSONObject("location");

        String address = jsonObj.getString("vicinity");

        addressLabel.setText("Διεύθυνση: "+address);
        int leDistance = (int) Math.round(
                distance(
                    Double.parseDouble(txtLat.getText()), 
                    Double.parseDouble(txtLng.getText()), 
                    location.getDouble("lat"), 
                    location.getDouble("lng"), 
                'm'));
        distanceLabel.setText("Απόσταση: "+leDistance+" μ");
        System.out.println("Calculated distance: "+leDistance);

        try{
            /* Display an image of the place */
            String photo_reference = this.results.getJSONObject(placeIndex).getJSONArray("photos").getJSONObject(0).getString("photo_reference");
            imageLabel.setIcon(fetchPlacePhoto(photo_reference));
            imageLabel.revalidate();
        }catch(JSONException e){
            imageLabel.setIcon(null);
            imageLabel.setText("no image found");
            System.err.println(e);
        }


    };
    
    private void handleCall(float lat, float lng, int rad, String type ) throws UnirestException, ParseException{
        try {
            
            String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json";
            url += "?location="+lat+","+lng;
            url += "&radius="+rad;
            url += "&language=el";
            url += "&types="+type;
            url += "&key="+this.googleKey;
            System.out.println("querying:  "+url);
            
            HttpResponse<JsonNode> jsonResponse = Unirest.get(url)
                .header("accept", "application/json")
                .asJson();
            
            JSONObject json = jsonResponse.getBody().getObject();
            this.results = json.getJSONArray("results");
            
            String names[] = new String[results.length()];
            for (int i = 0; i < results.length(); i++) {
                JSONObject jsonobject = results.getJSONObject(i);
                names[i] = jsonobject.getString("name");
            }
            
            listPois(names);
            
            
        } catch (UnirestException e) {
            System.err.println(e);
        }
    };
    
    /*
     *  Next three functions calculate the distance between two sets of coordinates.
     *  Source: http://www.geodatasource.com/developers/java
    */
    private double distance(double lat1, double lon1, double lat2, double lon2, char unit) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;  // unit is statute miles (default)
        if (unit == 'K') {  // unit is km
          dist = dist * 1.609344;
        }else if (unit == 'N') {    // unit is nautical miles
           dist = dist * 0.8684;
        }else if (unit == 'm'){     // unit is meters
          dist = dist * 1.609344 * 1000;
        }
        return (dist);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /*::  This function converts decimal degrees to radians             :*/
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /*::  This function converts radians to decimal degrees             :*/
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }
   
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
            java.util.logging.Logger.getLogger(PlacesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlacesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlacesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlacesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlacesUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList poiList;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JToggleButton retrievePoisButton;
    private javax.swing.JTextField txtLat;
    private javax.swing.JTextField txtLng;
    private javax.swing.JTextField txtRad;
    private javax.swing.JList typeList;
    // End of variables declaration//GEN-END:variables
}