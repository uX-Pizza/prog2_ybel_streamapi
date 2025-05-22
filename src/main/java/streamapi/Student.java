package streamapi;

import java.util.Objects;

/** Represent a student. */
public record Student(String name, int cps, Enrollment program) {
    /**
     * Check if a student is enrolled in Computer Science.
     *
     * @return {@code true}, iff the student is enrolled in Computer Science, otherwise {@code
     *     false}
     */
    public boolean isIFM() {
        return program == Enrollment.IFM;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Student) obj;
        return Objects.equals(this.name, that.name)
                && this.cps == that.cps
                && Objects.equals(this.program, that.program);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cps, program);
    }

    @Override
    public String toString() {
        return "Student["
                + "name="
                + name
                + ", "
                + "cps="
                + cps
                + ", "
                + "program="
                + program
                + ']';
    }
}
