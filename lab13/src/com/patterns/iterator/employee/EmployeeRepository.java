package com.patterns.iterator.employee;

public class EmployeeRepository implements EmployeeIterable {
    public String[] employees;

    public EmployeeRepository() {
        employees = new String[]{"David", "Scott", "Rhett", "Andrew", "Jessica"};
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator {
        int position;

        public EmployeeIterator() {
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < employees.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return employees[position++];
            }
            return null;
        }
    }
}
