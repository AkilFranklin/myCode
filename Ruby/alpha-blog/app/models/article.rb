class Article < ActiveRecord::Base
  
  #Enforcing a validation on the title to make sure that there is a title present
  validates :title, presence: true, length: { minimum: 3, maximum: 50 }
  validates :description, presence: true, length: { minimum: 10, maximum: 300 }
  
  
end