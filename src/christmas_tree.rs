use std::io::{self, Write};

fn main() {
	print!("What is the size of your christmas tree? ");
	io::stdout().flush().unwrap();

	let mut size = String::new();
	io::stdin().read_line(&mut size).expect("error reading input");

	let size: usize = match size.trim().parse() {
		Ok(num) => num,
		Err(_) => panic!("Not a valid number"),
	};

	for i in 0..=size {
    	println!("{}", " ".repeat(size-i) + &"*".repeat(1 + (i * 2)));
    }

    println!("{}", " ".repeat(size) + "|"); // Trunk
}
