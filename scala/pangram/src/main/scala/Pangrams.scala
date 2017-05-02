object Pangrams {
  def isPangram(sentence: String): Boolean = sentence.filter(_.isLetter).toLowerCase.distinct.length == 26
}
