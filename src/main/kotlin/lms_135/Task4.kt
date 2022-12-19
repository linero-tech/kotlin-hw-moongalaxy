package lms_135

class Hero {
  var health = 10
  var level = 0

  fun sick() {
    health--
  }

  fun heal() {
    health++
  }

  fun attack() {
    level++
  }
}