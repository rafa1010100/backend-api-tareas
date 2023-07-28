--se debe llamar import.sql
--id se omite ya que se genera automagicamente
INSERT INTO tareas(descripcion, fecha_creacion, vigente) VALUES('TAREA 00', NOW(), true);
INSERT INTO tareas(descripcion, fecha_creacion, vigente) VALUES('TAREA 01', NOW(), true);
INSERT INTO tareas(descripcion, fecha_creacion, vigente) VALUES('TAREA 10', NOW(), false);
INSERT INTO tareas(descripcion, fecha_creacion, vigente) VALUES('TAREA 11', NOW(), true);
