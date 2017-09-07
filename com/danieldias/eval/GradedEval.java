package com.danieldias.eval;

/**
 * This class models a Graded com.danieldias.eval.Evaluation by inheriting from the com.danieldias.eval.Evaluation Superclass.
 * A graded evaluation is an evaluation where the student submits work and the work
 * is graded by the professor or instructor.
 * It receives the title, the weight the actual grade the student obtained
 * and the max possible grade and can generate the students achieved weight
 * for the exam.
 *
 * @author Daniel Dias
 * @version 1.0
 */
public class GradedEval extends Evaluation {

    private double grade = 0;
    private double maxGrade = 10;

    /**
     * Default constructor. Invokes the default constructor from the
     * Superclass and sets the grade to 0 and the maxGrade to a default
     * value of 10
     *
     * @throws IllegalArgumentException if the title, weight, grade or
     * maxGrade are invalid
     */
    public GradedEval() throws IllegalArgumentException {
    }

    /**
     * Constructs an GradeEval object with a given title and weight, by invoking
     * the Full Parameterized constructor from the Superclass. Besides that,
     * sets the grade to 0 and the maxGrade to a default value of 10
     *
     * @param title the title of the Graded com.danieldias.eval.Evaluation
     * @param weight the weight of the Graded com.danieldias.eval.Evaluation
     * @throws IllegalArgumentException if title or weight contain invalid values
     */
    public GradedEval(String title, double weight) throws IllegalArgumentException {
        super(title, weight);
    }

    /**
     * Constructs an GradeEval object with a given title, weight, grade and maxGrade by invoking
     * the Full Parameterized constructor from the Superclass.
     *
     * @param title the title of the Graded com.danieldias.eval.Evaluation
     * @param weight the weight of the Graded com.danieldias.eval.Evaluation
     * @param grade the grade of the Graded com.danieldias.eval.Evaluation
     * @param maxGrade the max grade of the Graded com.danieldias.eval.Evaluation
     * @throws IllegalArgumentException if title, weight, grade or maxGrade contain invalid values
     */
    public GradedEval(String title, double weight, double grade, double maxGrade) throws IllegalArgumentException {
        super(title, weight);
        setGrade(grade);
        setMaxGrade(maxGrade);
    }

    /**
     * Retrieves the Students Grade.
     *
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Sets the students grade. The grade cannot be less than zero
     *
     * @param grade the grade to set
     *
     * @throws IllegalArgumentException if the grade is less than zero
     */
    public void setGrade(double grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("The Grade needs to be zero or higher");
        }
        this.grade = grade;
    }

    /**
     * Retrieves the Max Grade.
     *
     * @return the maxGrade
     */
    public double getMaxGrade() {
        return maxGrade;
    }

    /**
     * Sets the Max Grade. The Max Grade cannot be equal or smaller than zero
     *
     * @param maxGrade the maxGrade to set
     *
     * @throws IllegalArgumentException if the maxGrade is zero or less
     */
    public void setMaxGrade(double maxGrade) {
        if (maxGrade <= 0) {
            throw new IllegalArgumentException("The Max Grade needs to be higher than zero");
        }
        this.maxGrade = maxGrade;
    }

    /**
     * Override the achievedWeight() method from the Superclass
     *
     * Retrieves the students achieved grade by dividing the grade for the
     * maxGrade and then multiplying by the weight;
     *
     * @return the students achieved grade
     */
    @Override
    public double achievedWeight() {
        return grade/maxGrade*super.getWeight();
    }

    /**
     * Override the toString() method from the java.lang.Object Superclass
     *
     * Retrieves a String that contains the type of com.danieldias.eval.Evaluation, the actual grade
     * and the max grade.
     *
     * @return the string as specified.
     */
    @Override
    public String toString() {
        return String.format("com.danieldias.eval.GradedEval %4.1f/%4.1f",this.grade,this.maxGrade);
    }
}
