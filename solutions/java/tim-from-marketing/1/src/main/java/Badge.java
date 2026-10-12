class Badge {
    public String print(Integer id, String name, String department) {
        String badge = name;

        if (id != null) {
            badge = "[" + id + "] - " + badge;
        }

        if (department == null) {
            department = "OWNER";
        } else {
            department = department.toUpperCase();
        }

        return badge + " - " + department;
    }
}