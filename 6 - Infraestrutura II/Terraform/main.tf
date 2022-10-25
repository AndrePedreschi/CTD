provider "aws" {
  region = "us-east-2"
  
}

resource "aws_instance" "nome_do_recurso_terraform" {
    count = 2
  ami = "ami-097a2df4ac947655f"
  instance_type = "t2.micro"
  key_name = "terraform-aws"
  tags = {
    "Name" = "andre-${count.index}"
  }
}

resource "aws_key_pair" "andre_terraform_key" {
    key_name = "terraform-aws"
    public_key = file("terraform-aws.pub")
}

//pt5aluno55
//terraform init
//terraform plan
//terraform apply
//ubuntu@ip-.......