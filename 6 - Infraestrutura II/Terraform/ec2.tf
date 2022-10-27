//todo recurso tem o seu tipo e nome
resource "aws_instance" "andre_ec2" {
  count         = 2
  ami           = var.ami
  instance_type = var.tipo_instancia
  key_name      = "${var.usuario}-terraform-aws"
  tags = {
    "Name" = "${var.usuario}-ec2-${count.index}"
  }
  user_data = <<-EOF
  #!/bin/bash
    sudo apt update
    sudo apt install apache2 -y
  EOF
}