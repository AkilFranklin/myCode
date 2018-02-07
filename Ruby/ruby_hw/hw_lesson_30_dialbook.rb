dial_book = {
  "newyork" => "212",
  "newbruswick" =>"732"
}

def get_city_names(somehash)
  somehash.each { |k,v| puts k }
end

def get_area_code(somehash, key)
  somehash[key]
end

loop do
  puts "Do you want to look up a city name?"
  
  answer = gets.chomp
  if answer != "y"
    break
  end
  puts "Input city name"
  get_city_names(dial_book)
  input = gets.chomp
  
  if dial_book.include?(input)
    puts "The area code for #{input} is #{get_area_code(dial_book, input)}"
  else
    puts "Invalid"
  end
end





