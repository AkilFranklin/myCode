def number_input(input, text)
  input = nil # initialize the variable so you can invoke methods on it
  until input.is_a?(Float) do
    print "Please enter a number: "
    begin
      input = Float(gets)
    rescue ArgumentError # calling Integer with a string argument raises this
      input = nil        # explicitly reset input so the loop is re-entered
    end
  end
end
