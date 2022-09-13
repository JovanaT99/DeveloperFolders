package Nedelja6.users;

import Nedelja6.users.enums.PermissionLevel;

import static Nedelja6.Blog.userNextId;

public class ModeratorUser extends User {
   private int id;

    public ModeratorUser(String username, String password) {
        super(username, password);
        this.id= userNextId;
    }

    public int getId() {
        return id;
    }

    @Override
    PermissionLevel getPermisionLevel() {
        return PermissionLevel.MODERATOR;
    }

}
//9. Направити класу Blog која ради са свим претходним класама:
//     - Омогућава пријављивање корисника
//     - Омогућава испис свих објава
//
//     - Ако је тренутни корисник обичан корисник (Regular) (getPermissionLevel)
//         - Омогућава приказ коментара за објаву са одређеним `id`
//             - Омогућава брисање сопствених коментара
//         - Омогућава коментарисање објаве са одређеним `id`
//         - Омогућава испис објава тренутног корисника
//         - Омогућава брисање објаве тренутног корисника
//         - Омогућава прављење нове објаве
//     - Ако је тренутни корисник модератор (Moderator)
//         - Омогућава брисање било ког коментара
//     - Ако је тренутни корисник администратор (Admin)
//         - Омогућава брисање било ког коментара
//         - Омогућава брисање било које објаве