require 'pp' #pretty print
require_relative 'user' #use the class created. 

user = User.new('bob@email.com', 'Bob')

pp user

user.save
