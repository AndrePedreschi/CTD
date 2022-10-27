output "instancias_ec2-public" {
  value = aws_instance.andre_ec2.*.public_ip
  //o * é para ficar dinâmico com a quantidade de máquinas
  //isso é para acharmos o ip das máquinas
}

output "instancias_ec2-private" {
  value = aws_instance.andre_ec2.*.private_ip
  //o * é para ficar dinâmico com a quantidade de máquinas
  //isso é para acharmos o ip das máquinas
}