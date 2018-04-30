def isPrime(numcheck: Int): Boolean = {
  val limit = Math.floor(Math.sqrt(numcheck)).toInt
  for(n <- Range(2,limit+1)) {
    if(numcheck%n == 0) { return false }} 
  return true }

def isEven(numcheck: Int): Boolean = { return numcheck%2 == 0}

def areEvens(numlist: List[Int]): Boolean = {
  for (item <- numlist) { if (item%2 == 0) return true }
  return false }

def luckyNumberSeven(numlist: List[Int]): Int = {
  var this_sum = 0
  for (number <- numlist) { if (number == 7) this_sum = this_sum + 14; else this_sum = this_sum + number }
  return this_sum }

def balanceCheck(numlist: List[Int]): Boolean = {
  for (i <- Range(1, numlist.length)) {
    if (numlist.slice(0,i).sum == numlist.slice(i,numlist.length).sum) return true;
  }
  return false }

def isTextPalindrome(text: String): Boolean = {
  if (text == null) return false;
  var left = 0
  var right = text.length - 1
  while (left < right) {
    if (text.charAt(left) != text.charAt(right)) return false;
    left = left + 1
    right = right - 1
  }  
  return true }

