puts "What is your First name: "
first = gets.chomp
puts "What is your Last name"
last = gets.chomp
puts "Welcome to the Analyzer"
puts "Your first name length is #{first.length} and your last name is #{last.length}"

puts last.reverse + " " + first.reverse

