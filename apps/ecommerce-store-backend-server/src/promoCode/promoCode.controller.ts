import * as common from "@nestjs/common";
import * as swagger from "@nestjs/swagger";
import * as nestAccessControl from "nest-access-control";
import { PromoCodeService } from "./promoCode.service";
import { PromoCodeControllerBase } from "./base/promoCode.controller.base";

@swagger.ApiTags("promoCodes")
@common.Controller("promoCodes")
export class PromoCodeController extends PromoCodeControllerBase {
  constructor(
    protected readonly service: PromoCodeService,
    @nestAccessControl.InjectRolesBuilder()
    protected readonly rolesBuilder: nestAccessControl.RolesBuilder
  ) {
    super(service, rolesBuilder);
  }
}
