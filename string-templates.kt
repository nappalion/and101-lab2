val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

// \d{#} is regex for how many digits to get in the pattern
fun getPattern(): String = """\d{2} $month \d{4}"""
