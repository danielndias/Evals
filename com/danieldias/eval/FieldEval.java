package com.danieldias.eval;

/**
 * This class models a Field Study com.danieldias.eval.Evaluation by inheriting from the com.danieldias.eval.Evaluation Superclass.
 * A field study evaluation occurs when a student goes out into the field for a period of
 * time and performs industry work related to the field of study.
 * It receives the title, the weight, performance score (out of 100%,
 * determined by the professor or instructor based on on-site performance evaluation),
 * and employer evaluation score (out of 100%, a score submitted by the employer
 * that scores the student's performance during the field study). and can generate
 * the students achieved weight for the evaluation.
 *
 * @author Daniel Dias
 * @version 1.0
 */
public class FieldEval extends Evaluation  {

    private double performance = 0;
    private double employerEval = 0;

    /**
     * Default constructor. Invokes the default constructor from the
     * Superclass and sets the performance and the employerEval to 0
     *
     * @throws IllegalArgumentException if the title, weight,
     * performance or employerEval are invalid
     */
    public FieldEval() throws IllegalArgumentException {
    }

    /**
     * Constructs an com.danieldias.eval.FieldEval object with a given title and weight, by invoking
     * the Full Parameterized constructor from the Superclass. Besides that,
     * sets the performance and the employerEval to 0
     *
     * @param title the title of the Field Study com.danieldias.eval.Evaluation
     * @param weight the weight of the Field Study com.danieldias.eval.Evaluation
     * @throws IllegalArgumentException if title or weight contain invalid values
     */
    public FieldEval(String title, double weight) throws IllegalArgumentException {
        super(title, weight);
    }

    /**
     * Constructs an com.danieldias.eval.FieldEval object with a given title, weight performance and employerEval
     * by invoking the Full Parameterized constructor from the Superclass.
     *
     * @param title the title of the Field Study com.danieldias.eval.Evaluation
     * @param weight the weight of the Field Study com.danieldias.eval.Evaluation
     * @param performance the performance of the Field Study com.danieldias.eval.Evaluation
     * @param employerEval the employer evaluation of the Field Study com.danieldias.eval.Evaluation
     * @throws IllegalArgumentException if title or weight contain invalid values
     */
    public FieldEval(String title, double weight, double performance, double employerEval) {
        super(title, weight);
        setPerformance(performance);
        setEmployerEval(employerEval);
    }

    /**
     * Retrieves the Students Performance.
     *
     * @return the performance
     */
    public double getPerformance() {
        return performance;
    }

    /**
     * Sets the students performance. The performance cannot be
     * less than zero or more than 100
     *
     * @param performance the performance to set
     *
     * @throws IllegalArgumentException if the performance is
     * less than zero or more than 100.
     */
    public void setPerformance(double performance) {
        if (performance < 0 || performance > 100) {
            throw new IllegalArgumentException("The Performance needs to zero or higher");
        }
        this.performance = performance;
    }

    /**
     * Retrieves the Employer com.danieldias.eval.Evaluation.
     *
     * @return the employer evaluation
     */
    public double getEmployerEval() {
        return employerEval;
    }

    /**
     * Sets the employer evaluation. The evaluation cannot be
     * less than zero or more than 100
     *
     * @param employerEval the employer evaluation to set
     *
     * @throws IllegalArgumentException if the performance is
     * less than zero or more than 100.
     */
    public void setEmployerEval(double employerEval) {
        if (employerEval < 0 || employerEval > 100) {
            throw new IllegalArgumentException("The Employer com.danieldias.eval.Evaluation needs to zero or higher");
        }
        this.employerEval = employerEval;
    }

    /**
     * Override the achievedWeight() method from the Superclass
     *
     * Retrieves the students achieved grade by adding the performance and the
     * employer evaluation, dividing by 200 and then multiplying by the weight
     *
     * @return the students achieved grade
     */
    @Override
    public double achievedWeight() {
        return (performance+employerEval)/200*super.getWeight();
    }

    /**
     * Override the toString() method from the java.lang.Object Superclass
     *
     * Retrieves a String that contains the type of com.danieldias.eval.Evaluation,
     * the performance and the employer evaluation.
     *
     * @return the string as specified.
     */
    @Override
    public String toString() {
        return String.format("com.danieldias.eval.FieldEval - %4.1f, %4.1f",this.performance,this.employerEval);
    }
}
