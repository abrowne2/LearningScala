package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
	def fact(n: Int): Int = {
		if(n == 0)
			1
		else
			n * fact(n-1)
	}
	(fact(r) / (fact(c) * fact(r - c)))    	
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
    	def isParen(c: Char): Boolean = (c == ')' || c == '(')
	def branch(c: Char, chunk: List[Char], found: Boolean): Boolean = {
		if(chunk.isEmpty){
			found
		} else {
			if(c == '('){
				if(chunk.head == ')')
					branch(c, chunk.tail, true)
				else
					branch(c, chunk.tail, false)
			} else {
				branch(chunk.head, chunk.tail, found)
			}
		}
	}
	val parens = chars.filter(isParen)
	if(parens.length == 1) false else branch(parens.head, parens.tail, true)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

    }
  }
