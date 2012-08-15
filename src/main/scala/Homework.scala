object Homework {
  def foo = "foo"

  ////////////////////////////////////

  val naughtyWords = List("Celery", "Megatron")
  lazy val lowerNaughtyWords = naughtyWords map (_.toLowerCase)

  // I wasn't sure what to do with this. When I passed it in to split it did nothing.
  val wordBoundaryRegexPattern = """(?i)(^|\s)%s(\s|$)""" // The %s is for use with the printf style format method

  def isNaughty(text: String) = {

    val lowerText = text.toLowerCase split (" +")

    // Discovered the exists() method. I feel like I'm cheating.
    lowerNaughtyWords exists (lowerText contains)
  }
}

