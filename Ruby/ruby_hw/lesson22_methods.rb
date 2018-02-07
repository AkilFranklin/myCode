def multiply (first_number,second_number)
  first_number.to_f * second_number.to_f  
end

def divide (first_number,second_number)
  first_number.to_f / second_number.to_f  
end

def subtract (first_number,second_number)
  first_number.to_f - second_number.to_f  
end

def mod (first_number,second_number)
  first_number.to_f % second_number.to_f  
end
# ruby will understand that the result is being returned without saying "return first*second"

puts "Give me two numbers: "
first = gets.chomp
second = gets.chomp
puts "What do you want to do? 1. Mult 2. Div 3. Sub 4. Mod... Type \'exit' to quit"
choice = 1
while choice
  
  choice = gets.chomp

  if choice.to_i == 1
    puts "You have chosen to multiply #{first} with #{second}, the answer is"
    puts multiply(first,second)
  elsif choice.to_i == 2
    puts "You have chosen Division, the answer is"
    puts divide(first,second)
  elsif choice.to_i == 3
    puts "You have chosen Subtraction, the answer is"  
    puts subtract(first,second)
  elsif choice.to_i == 4
    puts "You have chosen Mod, the answer is"
    puts mod(first,second)
  elsif choice == "exit"
    break
  else
    puts "You have made an error in your choice"
  end
  puts "1) Mult 2)Div 3)Sub 4)Mod... Type \'exit' to quit"
end




#  puts "The answer is #{multiply(first,second)}" 
#  puts multiply(17,3)