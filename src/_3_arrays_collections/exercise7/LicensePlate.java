package _3_arrays_collections.exercise7;

public class LicensePlate {

    // final variables cannot be changes after object creation
    private final String code;
    private final String landCode;

    public LicensePlate(String landCode, String code) {
        this.code = code;
        this.landCode = landCode;
    }

    @Override
    public String toString() {
        return landCode + " " + code;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((landCode == null) ? 0 : landCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LicensePlate other = (LicensePlate) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (landCode == null) {
            if (other.landCode != null)
                return false;
        } else if (!landCode.equals(other.landCode))
            return false;
        return true;
    }
    
}
