/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekimini.kadenze;

import java.io.FileNotFoundException;
import java.io.IOException;
import wekimini.Wekinator;
import wekimini.osc.OSCOutput;

/**
 *
 * @author rebecca
 */
public class NoLogger implements KadenzeLogger {

    @Override
    public void closeLog() {
    }

    @Override
    public String createZip() throws FileNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crossValidationComputed(Wekinator w, int modelNum, int numFolds, double val) {
    }

    @Override
    public void deleteLastRecordingRound(Wekinator w, int deletedRound) {
    }

    @Override
    public void dtwGestureAdded(Wekinator w, int gestureNum) {
    }

    @Override
    public void dtwRunData(Wekinator w, double[] inputs, double[] outputs, int recognizedGesture) {
    }

    @Override
    public void dtwRunStart(Wekinator w) {
    }

    @Override
    public void dtwThresholdChanged(Wekinator w) {
    }

    @Override
    public void examplesDeletedForModel(Wekinator w, int modelNum) {
    }

    @Override
    public void flush() {
    }

    @Override
    public void learningAlgorithmChanged(Wekinator w, int modelNum) {
    }

    @Override
    public void logEvent(Wekinator w, KEvent ke) {
    }

    @Override
    public void logVersionNumberAndDate() {
    }

    @Override
    public void newProjectStarted(Wekinator w) {
    }

    @Override
    public void projectLoaded(Wekinator w, String projectName) {
    }

    @Override
    public void projectSaved(Wekinator w, String projectName) {
    }

    @Override
    public void reAddLastRecordingRound(Wekinator w, int num) {
    }

    @Override
    public void selectedFeatures(Wekinator w, boolean[] matrix) {
    }

    @Override
    public void supervisedLearningRecordStarted(Wekinator w) {
    }

    @Override
    public void supervisedLearningRecordStopped(Wekinator w) {
    }

    @Override
    public void supervisedOutputEdited(Wekinator w, int whichOutput, OSCOutput oldOutput) {
    }

    @Override
    public void supervisedRunData(Wekinator w, double[] inputs, boolean[] computeMask, double[] outputs) {
    }

    @Override
    public void supervisedTrainFinished(Wekinator w) throws IOException {
    }

    @Override
    public void trainingAccuracyComputed(Wekinator w, int modelNum, double val) {
    }

    @Override
    public void beginLog(String parentDir, KadenzeAssignment.KadenzeAssignmentType a) throws IOException {
    }

    @Override
    public void sameAssignmentRequested(KadenzeAssignment.KadenzeAssignmentType a) {
    }

    @Override
    public String getCurrentLoggingDirectory() {
        return "ERROR: NO DIRECTORY";
    }
}
