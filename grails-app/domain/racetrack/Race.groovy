package racetrack

class Race {
    static constraints = {
        name()
        startDate()
        city()
        state()
        distance()
        cost()
        maxRunners()
    }

    String name
    Date startDate
    String city
    String state
    BigDecimal distance
    BigDecimal cost
    Integer maxRunners = 100000


}
