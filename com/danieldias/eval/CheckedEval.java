package com.danieldias.eval;

/**
 * This class models a Check-Off com.danieldias.eval.Evaluation with the status of complete or not by inheriting
 * from the com.danieldias.eval.GradedEval Superclass.
 * A check-off evaluation is an evaluation where the student does an exercise or other
 * work and the work is checked off as "complete" by the professor or instructor.
 * It receives the title, the weight, the actual
 * grade the student obtained, the max possible grade and if the grade is
 * completed or not and can generate the students achieved weight for the exam.
 *
 * @author Daniel Dias
 * @version 1.0
 */
public class CheckedEval extends GradedEval {

    private boolean complete;

    /**
     * Default constructor. Invokes the default constructor from the Superclass
     */
    public CheckedEval() {
    }

    /**
     * Constructs an GradeEval object with a given title and weight, by invoking
     * the 2-parameter constructor from the Superclass.
     *
     * @param title the title of the Graded com.danieldias.eval.Evaluation
     * @param weight the weight of the Graded com.danieldias.eval.Evaluation
     * @throws IllegalArgumentException if title or weight contain invalid values
     */
    public CheckedEval(String title, double weight) throws IllegalArgumentException {
        super(title, weight);
    }

    /**
     * Constructs an GradeEval object with a given title, weight, grade, maxGrade and
     * complete boolean value by invoking the Full Parameterized constructor from the Superclass.
     *
     * @param title the title of the Graded com.danieldias.eval.Evaluation
     * @param weight the weight of the Graded com.danieldias.eval.Evaluation
     * @param grade the grade of the Graded com.danieldias.eval.Evaluation
     * @param maxGrade the max grade of the Graded com.danieldias.eval.Evaluation
     * @param complete the complete boolean value.
     * @throws IllegalArgumentException if title, weight, grade, maxGrade or complete
     * contain invalid values
     */
    public CheckedEval(String title, double weight, double grade, double maxGrade, boolean complete)
            throws IllegalArgumentException {
        super(title, weight, grade, maxGrade);
        setComplete(complete);
    }

    /**
     * Retrieves the Complete boolean value.
     *
     * @return the complete
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Sets the Complete boolean value. If the value is true, the students actual grade
     * is changed to the max possible grade of the exam. If the value is false, the
     * students actual grade is changed to zero.
     *
     * @param complete the complete boolean value to set
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
        if (complete) {
            this.setGrade(this.getMaxGrade());
        } else {
            this.setGrade(0);
        }
    }

    /**
     * Override the achievedWeight() method from the Superclass
     *
     * Retrieves the students achieved grade by checking the boolean value
     * for the complete. If true, calls the achievedWeight() method from the
     * superclass. If false, returns 0
     *
     * @return the students achieved grade
     */
    @Override
    public double achievedWeight() {
        if (complete) {
            return super.achievedWeight();
        } else {
            return 0;
        }
    }

    /**
     * Override the toString() method from the Superclass
     *
     * Retrieves a String that contains the type of com.danieldias.eval.Evaluation, the actual grade,
     * the max grade and if the evaluation is completed or not.
     *
     * @return the string as specified.
     */
    @Override
    public String toString() {
        if (complete) {
            return String.format("com.danieldias.eval.CheckedEval - %4.1f/%4.1f (COMPLETE)",super.getGrade(),super.getMaxGrade());
        } else {
            return String.format("com.danieldias.eval.CheckedEval - %4.1f/%4.1f (INCOMPLETE)",super.getGrade(),super.getMaxGrade());
        }
    }
}
